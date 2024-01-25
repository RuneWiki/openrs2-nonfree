import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qw")
public final class Class286 implements Runnable {

	@OriginalMember(owner = "client!qw", name = "g", descriptor = "Lclient!vu;")
	private final Class363 aClass363_46 = new Class363();

	@OriginalMember(owner = "client!qw", name = "m", descriptor = "I")
	public int anInt8168 = 0;

	@OriginalMember(owner = "client!qw", name = "l", descriptor = "Z")
	private boolean aBoolean583 = false;

	@OriginalMember(owner = "client!qw", name = "n", descriptor = "Ljava/lang/Thread;")
	private Thread aThread6;

	@OriginalMember(owner = "client!qw", name = "<init>", descriptor = "(Lclient!rp;)V")
	public Class286(@OriginalArg(0) Class298 arg0) {
		@Pc(20) Class174 local20 = arg0.method7289(5, this);
		while (local20.anInt5121 == 0) {
			Static143.method2414(10L);
		}
		if (local20.anInt5121 == 2) {
			throw new RuntimeException();
		}
		this.aThread6 = (Thread) local20.anObject12;
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(IILclient!kv;)Lclient!dd;")
	public Class3_Sub7_Sub4_Sub2 method7058(@OriginalArg(1) int arg0, @OriginalArg(2) Class196 arg1) {
		@Pc(7) Class3_Sub7_Sub4_Sub2 local7 = new Class3_Sub7_Sub4_Sub2();
		local7.aBoolean127 = false;
		local7.anInt1763 = 3;
		local7.aLong251 = (long) arg0;
		local7.aClass196_2 = arg1;
		this.method7062(local7);
		return local7;
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(ILclient!kv;B)Lclient!dd;")
	public Class3_Sub7_Sub4_Sub2 method7061(@OriginalArg(0) int arg0, @OriginalArg(1) Class196 arg1) {
		@Pc(15) Class3_Sub7_Sub4_Sub2 local15 = new Class3_Sub7_Sub4_Sub2();
		local15.anInt1763 = 1;
		@Pc(21) Class363 local21 = this.aClass363_46;
		synchronized (this.aClass363_46) {
			@Pc(29) Class3_Sub7_Sub4_Sub2 local29 = (Class3_Sub7_Sub4_Sub2) this.aClass363_46.method8414();
			while (true) {
				if (local29 == null) {
					break;
				}
				if ((long) arg0 == local29.aLong251 && local29.aClass196_2 == arg1 && local29.anInt1763 == 2) {
					local15.aByteArray16 = local29.aByteArray16;
					local15.aBoolean126 = false;
					return local15;
				}
				local29 = (Class3_Sub7_Sub4_Sub2) this.aClass363_46.method8415();
			}
		}
		local15.aByteArray16 = arg1.method5175(arg0);
		local15.aBoolean126 = false;
		local15.aBoolean127 = true;
		return local15;
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(Lclient!dd;I)V")
	private void method7062(@OriginalArg(0) Class3_Sub7_Sub4_Sub2 arg0) {
		@Pc(6) Class363 local6 = this.aClass363_46;
		synchronized (this.aClass363_46) {
			this.aClass363_46.method8413(arg0);
			this.anInt8168++;
			this.aClass363_46.notifyAll();
		}
	}

	@OriginalMember(owner = "client!qw", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean583) {
			@Pc(6) Class363 local6 = this.aClass363_46;
			@Pc(14) Class3_Sub7_Sub4_Sub2 local14;
			synchronized (this.aClass363_46) {
				local14 = (Class3_Sub7_Sub4_Sub2) this.aClass363_46.method8420();
				if (local14 == null) {
					try {
						this.aClass363_46.wait();
					} catch (@Pc(29) InterruptedException local29) {
					}
					continue;
				}
				this.anInt8168--;
			}
			try {
				if (local14.anInt1763 == 2) {
					local14.aClass196_2.method5176((int) local14.aLong251, local14.aByteArray16.length, local14.aByteArray16);
				} else if (local14.anInt1763 == 3) {
					local14.aByteArray16 = local14.aClass196_2.method5175((int) local14.aLong251);
				}
			} catch (@Pc(76) Exception local76) {
				Static296.method5075(local76, (String) null);
			}
			local14.aBoolean126 = false;
		}
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "([BLclient!kv;II)Lclient!dd;")
	public Class3_Sub7_Sub4_Sub2 method7063(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class196 arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class3_Sub7_Sub4_Sub2 local7 = new Class3_Sub7_Sub4_Sub2();
		local7.aByteArray16 = arg0;
		local7.aLong251 = (long) arg2;
		local7.anInt1763 = 2;
		local7.aClass196_2 = arg1;
		local7.aBoolean127 = false;
		this.method7062(local7);
		return local7;
	}

	@OriginalMember(owner = "client!qw", name = "b", descriptor = "(I)V")
	public void method7064() {
		this.aBoolean583 = true;
		@Pc(9) Class363 local9 = this.aClass363_46;
		synchronized (this.aClass363_46) {
			this.aClass363_46.notifyAll();
		}
		try {
			this.aThread6.join();
		} catch (@Pc(25) InterruptedException local25) {
		}
		this.aThread6 = null;
	}
}
