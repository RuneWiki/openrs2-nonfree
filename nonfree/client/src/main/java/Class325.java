import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tl")
public final class Class325 implements Runnable {

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "Lclient!jh;")
	private final Class175 aClass175_12 = new Class175();

	@OriginalMember(owner = "client!tl", name = "i", descriptor = "I")
	public int anInt9100 = 0;

	@OriginalMember(owner = "client!tl", name = "f", descriptor = "Z")
	private boolean aBoolean666 = false;

	@OriginalMember(owner = "client!tl", name = "k", descriptor = "Ljava/lang/Thread;")
	private Thread aThread6;

	@OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(Lclient!vk;)V")
	public Class325(@OriginalArg(0) Class359 arg0) {
		@Pc(20) Class26 local20 = arg0.method8278(5, this);
		while (local20.anInt762 == 0) {
			Static57.method1062(10L);
		}
		if (local20.anInt762 == 2) {
			throw new RuntimeException();
		}
		this.aThread6 = (Thread) local20.anObject3;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(ILclient!pk;Z)Lclient!jba;")
	public Class2_Sub5_Sub6_Sub2 method7649(@OriginalArg(0) int arg0, @OriginalArg(1) Class262 arg1) {
		@Pc(7) Class2_Sub5_Sub6_Sub2 local7 = new Class2_Sub5_Sub6_Sub2();
		local7.aLong283 = arg0;
		local7.aBoolean401 = false;
		local7.anInt5027 = 3;
		local7.aClass262_1 = arg1;
		this.method7651(local7);
		return local7;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(BLclient!pk;I)Lclient!jba;")
	public Class2_Sub5_Sub6_Sub2 method7650(@OriginalArg(1) Class262 arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class2_Sub5_Sub6_Sub2 local13 = new Class2_Sub5_Sub6_Sub2();
		local13.anInt5027 = 1;
		@Pc(19) Class175 local19 = this.aClass175_12;
		synchronized (this.aClass175_12) {
			@Pc(27) Class2_Sub5_Sub6_Sub2 local27 = (Class2_Sub5_Sub6_Sub2) this.aClass175_12.method4280();
			while (true) {
				if (local27 == null) {
					break;
				}
				if ((long) arg1 == local27.aLong283 && arg0 == local27.aClass262_1 && local27.anInt5027 == 2) {
					local13.aBoolean400 = false;
					local13.aByteArray48 = local27.aByteArray48;
					return local13;
				}
				local27 = (Class2_Sub5_Sub6_Sub2) this.aClass175_12.method4288();
			}
		}
		local13.aByteArray48 = arg0.method6494(arg1);
		local13.aBoolean400 = false;
		local13.aBoolean401 = true;
		return local13;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(BLclient!jba;)V")
	private void method7651(@OriginalArg(1) Class2_Sub5_Sub6_Sub2 arg0) {
		@Pc(6) Class175 local6 = this.aClass175_12;
		synchronized (this.aClass175_12) {
			this.aClass175_12.method4287(arg0);
			this.anInt9100++;
			this.aClass175_12.notifyAll();
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lclient!pk;[BII)Lclient!jba;")
	public Class2_Sub5_Sub6_Sub2 method7652(@OriginalArg(0) Class262 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class2_Sub5_Sub6_Sub2 local7 = new Class2_Sub5_Sub6_Sub2();
		local7.aClass262_1 = arg0;
		local7.aBoolean401 = false;
		local7.aByteArray48 = arg1;
		local7.aLong283 = arg2;
		local7.anInt5027 = 2;
		this.method7651(local7);
		return local7;
	}

	@OriginalMember(owner = "client!tl", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean666) {
			@Pc(10) Class175 local10 = this.aClass175_12;
			@Pc(18) Class2_Sub5_Sub6_Sub2 local18;
			synchronized (this.aClass175_12) {
				local18 = (Class2_Sub5_Sub6_Sub2) this.aClass175_12.method4284();
				if (local18 == null) {
					try {
						this.aClass175_12.wait();
					} catch (@Pc(25) InterruptedException local25) {
					}
					continue;
				}
				this.anInt9100--;
			}
			try {
				if (local18.anInt5027 == 2) {
					local18.aClass262_1.method6492(local18.aByteArray48, (int) local18.aLong283, local18.aByteArray48.length);
				} else if (local18.anInt5027 == 3) {
					local18.aByteArray48 = local18.aClass262_1.method6494((int) local18.aLong283);
				}
			} catch (@Pc(76) Exception local76) {
				Static420.method6396(null, local76);
			}
			local18.aBoolean400 = false;
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(Z)V")
	public void method7653() {
		this.aBoolean666 = true;
		@Pc(9) Class175 local9 = this.aClass175_12;
		synchronized (this.aClass175_12) {
			this.aClass175_12.notifyAll();
		}
		try {
			this.aThread6.join();
		} catch (@Pc(25) InterruptedException local25) {
		}
		this.aThread6 = null;
	}
}
