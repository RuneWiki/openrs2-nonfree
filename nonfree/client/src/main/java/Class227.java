import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tc")
public final class Class227 implements Runnable {

	@OriginalMember(owner = "client!tc", name = "k", descriptor = "Lclient!kn;")
	private final Class140 aClass140_10 = new Class140();

	@OriginalMember(owner = "client!tc", name = "p", descriptor = "I")
	public int anInt6592 = 0;

	@OriginalMember(owner = "client!tc", name = "n", descriptor = "Z")
	private boolean aBoolean439 = false;

	@OriginalMember(owner = "client!tc", name = "l", descriptor = "Ljava/lang/Thread;")
	private Thread aThread2;

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(Lclient!hu;)V")
	public Class227(@OriginalArg(0) Class114 arg0) {
		@Pc(20) Class108 local20 = arg0.method2342(5, this);
		while (local20.anInt2803 == 0) {
			Static20.method1515(10L);
		}
		if (local20.anInt2803 == 2) {
			throw new RuntimeException();
		}
		this.aThread2 = (Thread) local20.anObject4;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "([BILclient!ht;I)Lclient!mk;")
	public Class4_Sub1_Sub3_Sub2 method5112(@OriginalArg(0) byte[] arg0, @OriginalArg(2) Class113 arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class4_Sub1_Sub3_Sub2 local12 = new Class4_Sub1_Sub3_Sub2();
		local12.aByteArray44 = arg0;
		local12.anInt4506 = 2;
		local12.aClass113_3 = arg1;
		local12.aLong226 = arg2;
		local12.aBoolean331 = false;
		this.method5116(local12);
		return local12;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V")
	public void method5113() {
		this.aBoolean439 = true;
		@Pc(9) Class140 local9 = this.aClass140_10;
		synchronized (this.aClass140_10) {
			this.aClass140_10.notifyAll();
		}
		try {
			this.aThread2.join();
		} catch (@Pc(31) InterruptedException local31) {
		}
		this.aThread2 = null;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IILclient!ht;)Lclient!mk;")
	public Class4_Sub1_Sub3_Sub2 method5114(@OriginalArg(1) int arg0, @OriginalArg(2) Class113 arg1) {
		@Pc(9) Class4_Sub1_Sub3_Sub2 local9 = new Class4_Sub1_Sub3_Sub2();
		local9.anInt4506 = 1;
		@Pc(15) Class140 local15 = this.aClass140_10;
		synchronized (this.aClass140_10) {
			@Pc(23) Class4_Sub1_Sub3_Sub2 local23 = (Class4_Sub1_Sub3_Sub2) this.aClass140_10.method3014();
			while (true) {
				if (local23 == null) {
					break;
				}
				if ((long) arg0 == local23.aLong226 && arg1 == local23.aClass113_3 && local23.anInt4506 == 2) {
					local9.aBoolean330 = false;
					local9.aByteArray44 = local23.aByteArray44;
					return local9;
				}
				local23 = (Class4_Sub1_Sub3_Sub2) this.aClass140_10.method3018();
			}
		}
		local9.aByteArray44 = arg1.method2338(arg0);
		local9.aBoolean330 = false;
		local9.aBoolean331 = true;
		return local9;
	}

	@OriginalMember(owner = "client!tc", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean439) {
			@Pc(10) Class140 local10 = this.aClass140_10;
			@Pc(18) Class4_Sub1_Sub3_Sub2 local18;
			synchronized (this.aClass140_10) {
				local18 = (Class4_Sub1_Sub3_Sub2) this.aClass140_10.method3016();
				if (local18 == null) {
					try {
						this.aClass140_10.wait();
					} catch (@Pc(25) InterruptedException local25) {
					}
					continue;
				}
				this.anInt6592--;
			}
			try {
				if (local18.anInt4506 == 2) {
					local18.aClass113_3.method2337((int) local18.aLong226, local18.aByteArray44.length, local18.aByteArray44);
				} else if (local18.anInt4506 == 3) {
					local18.aByteArray44 = local18.aClass113_3.method2338((int) local18.aLong226);
				}
			} catch (@Pc(74) Exception local74) {
				Static273.method3690(null, local74);
			}
			local18.aBoolean330 = false;
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lclient!mk;I)V")
	private void method5116(@OriginalArg(0) Class4_Sub1_Sub3_Sub2 arg0) {
		@Pc(6) Class140 local6 = this.aClass140_10;
		synchronized (this.aClass140_10) {
			this.aClass140_10.method3015(arg0);
			this.anInt6592++;
			this.aClass140_10.notifyAll();
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lclient!ht;II)Lclient!mk;")
	public Class4_Sub1_Sub3_Sub2 method5117(@OriginalArg(0) Class113 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class4_Sub1_Sub3_Sub2 local7 = new Class4_Sub1_Sub3_Sub2();
		local7.aBoolean331 = false;
		local7.aClass113_3 = arg0;
		local7.anInt4506 = 3;
		local7.aLong226 = arg1;
		this.method5116(local7);
		return local7;
	}
}
