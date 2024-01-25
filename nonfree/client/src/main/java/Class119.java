import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ik")
public final class Class119 implements Runnable {

	@OriginalMember(owner = "client!ik", name = "j", descriptor = "Lclient!uq;")
	private final Class247 aClass247_2 = new Class247();

	@OriginalMember(owner = "client!ik", name = "m", descriptor = "I")
	public int anInt3031 = 0;

	@OriginalMember(owner = "client!ik", name = "o", descriptor = "Z")
	private boolean aBoolean238 = false;

	@OriginalMember(owner = "client!ik", name = "n", descriptor = "Ljava/lang/Thread;")
	private Thread aThread2;

	static {
		new Class96("Error sending message to clan chat - please try again later!", "Fehler beim Versenden der Nachricht - bitte versuch es später erneut.", "Erreur lors de l'envoi du message au canal de clan - veuillez réessayer ultérieurement.", "Erro ao enviar mensagem ao canal de clã. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(Lclient!ci;)V")
	public Class119(@OriginalArg(0) Class42 arg0) {
		@Pc(20) Class159 local20 = arg0.method653(5, this);
		while (local20.anInt4271 == 0) {
			Static366.method5214(10L);
		}
		if (local20.anInt4271 == 2) {
			throw new RuntimeException();
		}
		this.aThread2 = (Thread) local20.anObject8;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(ILclient!pf;)V")
	private void method2630(@OriginalArg(1) Class1_Sub1_Sub11_Sub1 arg0) {
		@Pc(6) Class247 local6 = this.aClass247_2;
		synchronized (this.aClass247_2) {
			this.aClass247_2.method5590(arg0);
			this.anInt3031++;
			this.aClass247_2.notifyAll();
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(ILclient!kn;[BZ)Lclient!pf;")
	public Class1_Sub1_Sub11_Sub1 method2631(@OriginalArg(0) int arg0, @OriginalArg(1) Class141 arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(7) Class1_Sub1_Sub11_Sub1 local7 = new Class1_Sub1_Sub11_Sub1();
		local7.anInt5062 = 2;
		local7.aClass141_4 = arg1;
		local7.aByteArray60 = arg2;
		local7.aLong231 = arg0;
		local7.aBoolean650 = false;
		this.method2630(local7);
		return local7;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(IBLclient!kn;)Lclient!pf;")
	public Class1_Sub1_Sub11_Sub1 method2632(@OriginalArg(0) int arg0, @OriginalArg(2) Class141 arg1) {
		@Pc(14) Class1_Sub1_Sub11_Sub1 local14 = new Class1_Sub1_Sub11_Sub1();
		local14.anInt5062 = 1;
		@Pc(20) Class247 local20 = this.aClass247_2;
		synchronized (this.aClass247_2) {
			@Pc(28) Class1_Sub1_Sub11_Sub1 local28 = (Class1_Sub1_Sub11_Sub1) this.aClass247_2.method5591();
			while (true) {
				if (local28 == null) {
					break;
				}
				if ((long) arg0 == local28.aLong231 && arg1 == local28.aClass141_4 && local28.anInt5062 == 2) {
					local14.aBoolean649 = false;
					local14.aByteArray60 = local28.aByteArray60;
					return local14;
				}
				local28 = (Class1_Sub1_Sub11_Sub1) this.aClass247_2.method5587();
			}
		}
		local14.aByteArray60 = arg1.method3193(arg0);
		local14.aBoolean650 = true;
		local14.aBoolean649 = false;
		return local14;
	}

	@OriginalMember(owner = "client!ik", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean238) {
			@Pc(6) Class247 local6 = this.aClass247_2;
			@Pc(14) Class1_Sub1_Sub11_Sub1 local14;
			synchronized (this.aClass247_2) {
				local14 = (Class1_Sub1_Sub11_Sub1) this.aClass247_2.method5585();
				if (local14 == null) {
					try {
						this.aClass247_2.wait();
					} catch (@Pc(21) InterruptedException local21) {
					}
					continue;
				}
				this.anInt3031--;
			}
			try {
				if (local14.anInt5062 == 2) {
					local14.aClass141_4.method3195(local14.aByteArray60.length, local14.aByteArray60, (int) local14.aLong231);
				} else if (local14.anInt5062 == 3) {
					local14.aByteArray60 = local14.aClass141_4.method3193((int) local14.aLong231);
				}
			} catch (@Pc(72) Exception local72) {
				Static101.method1630(null, local72);
			}
			local14.aBoolean649 = false;
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(BILclient!kn;)Lclient!pf;")
	public Class1_Sub1_Sub11_Sub1 method2635(@OriginalArg(1) int arg0, @OriginalArg(2) Class141 arg1) {
		@Pc(7) Class1_Sub1_Sub11_Sub1 local7 = new Class1_Sub1_Sub11_Sub1();
		local7.aBoolean650 = false;
		local7.anInt5062 = 3;
		local7.aClass141_4 = arg1;
		local7.aLong231 = arg0;
		this.method2630(local7);
		return local7;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(Z)V")
	public void method2636() {
		this.aBoolean238 = true;
		@Pc(9) Class247 local9 = this.aClass247_2;
		synchronized (this.aClass247_2) {
			this.aClass247_2.notifyAll();
		}
		try {
			this.aThread2.join();
		} catch (@Pc(25) InterruptedException local25) {
		}
		this.aThread2 = null;
	}
}
