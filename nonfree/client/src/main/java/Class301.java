import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qh")
public final class Class301 implements Runnable {

	@OriginalMember(owner = "client!qh", name = "j", descriptor = "Lclient!wca;")
	private final Class388 aClass388_13 = new Class388();

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "I")
	public int anInt7865 = 0;

	@OriginalMember(owner = "client!qh", name = "m", descriptor = "Z")
	private boolean aBoolean529 = false;

	@OriginalMember(owner = "client!qh", name = "l", descriptor = "Ljava/lang/Thread;")
	private Thread aThread5;

	@OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(Lclient!tga;)V")
	public Class301(@OriginalArg(0) Class349 arg0) {
		@Pc(20) Class361 local20 = arg0.method7746(this, 5);
		while (local20.anInt9720 == 0) {
			Static620.method7045(-4, 10L);
		}
		if (local20.anInt9720 == 2) {
			throw new RuntimeException();
		}
		this.aThread5 = (Thread) local20.anObject20;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(B[BLclient!dca;I)Lclient!lba;")
	public Class5_Sub1_Sub4_Sub1 method6822(@OriginalArg(1) byte[] arg0, @OriginalArg(2) Class75 arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class5_Sub1_Sub4_Sub1 local7 = new Class5_Sub1_Sub4_Sub1();
		local7.aClass75_2 = arg1;
		local7.aBoolean587 = false;
		local7.anInt5499 = 2;
		local7.aLong298 = (long) arg2;
		local7.aByteArray60 = arg0;
		this.method6825(local7);
		return local7;
	}

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "(IILclient!dca;)Lclient!lba;")
	public Class5_Sub1_Sub4_Sub1 method6824(@OriginalArg(0) int arg0, @OriginalArg(2) Class75 arg1) {
		@Pc(14) Class5_Sub1_Sub4_Sub1 local14 = new Class5_Sub1_Sub4_Sub1();
		local14.anInt5499 = 3;
		local14.aLong298 = (long) arg0;
		local14.aBoolean587 = false;
		local14.aClass75_2 = arg1;
		this.method6825(local14);
		return local14;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lclient!lba;B)V")
	private void method6825(@OriginalArg(0) Class5_Sub1_Sub4_Sub1 arg0) {
		@Pc(6) Class388 local6 = this.aClass388_13;
		synchronized (this.aClass388_13) {
			this.aClass388_13.method9022(arg0);
			this.anInt7865++;
			this.aClass388_13.notifyAll();
		}
	}

	@OriginalMember(owner = "client!qh", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean529) {
			@Pc(6) Class388 local6 = this.aClass388_13;
			@Pc(14) Class5_Sub1_Sub4_Sub1 local14;
			synchronized (this.aClass388_13) {
				local14 = (Class5_Sub1_Sub4_Sub1) this.aClass388_13.method9029();
				if (local14 == null) {
					try {
						this.aClass388_13.wait();
					} catch (@Pc(22) InterruptedException local22) {
					}
					continue;
				}
				this.anInt7865--;
			}
			try {
				if (local14.anInt5499 == 2) {
					local14.aClass75_2.method1394((int) local14.aLong298, local14.aByteArray60.length, local14.aByteArray60);
				} else if (local14.anInt5499 == 3) {
					local14.aByteArray60 = local14.aClass75_2.method1395((int) local14.aLong298);
				}
			} catch (@Pc(79) Exception local79) {
				Static522.method7115(local79, (String) null);
			}
			local14.aBoolean589 = false;
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IILclient!dca;)Lclient!lba;")
	public Class5_Sub1_Sub4_Sub1 method6826(@OriginalArg(0) int arg0, @OriginalArg(2) Class75 arg1) {
		@Pc(9) Class5_Sub1_Sub4_Sub1 local9 = new Class5_Sub1_Sub4_Sub1();
		local9.anInt5499 = 1;
		@Pc(15) Class388 local15 = this.aClass388_13;
		synchronized (this.aClass388_13) {
			@Pc(23) Class5_Sub1_Sub4_Sub1 local23 = (Class5_Sub1_Sub4_Sub1) this.aClass388_13.method9027();
			while (true) {
				if (local23 == null) {
					break;
				}
				if ((long) arg0 == local23.aLong298 && local23.aClass75_2 == arg1 && local23.anInt5499 == 2) {
					local9.aBoolean589 = false;
					local9.aByteArray60 = local23.aByteArray60;
					return local9;
				}
				local23 = (Class5_Sub1_Sub4_Sub1) this.aClass388_13.method9024();
			}
		}
		local9.aByteArray60 = arg1.method1395(arg0);
		local9.aBoolean589 = false;
		local9.aBoolean587 = true;
		return local9;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)V")
	public void method6827() {
		this.aBoolean529 = true;
		@Pc(9) Class388 local9 = this.aClass388_13;
		synchronized (this.aClass388_13) {
			this.aClass388_13.notifyAll();
		}
		try {
			this.aThread5.join();
		} catch (@Pc(30) InterruptedException local30) {
		}
		this.aThread5 = null;
	}
}
