import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dw")
public final class Class92 implements Runnable {

	@OriginalMember(owner = "client!dw", name = "i", descriptor = "Lclient!vl;")
	private final Class388 aClass388_3 = new Class388();

	@OriginalMember(owner = "client!dw", name = "d", descriptor = "I")
	public int anInt2156 = 0;

	@OriginalMember(owner = "client!dw", name = "j", descriptor = "Z")
	private boolean aBoolean239 = false;

	@OriginalMember(owner = "client!dw", name = "b", descriptor = "Ljava/lang/Thread;")
	private Thread aThread3;

	@OriginalMember(owner = "client!dw", name = "<init>", descriptor = "(Lclient!vo;)V")
	public Class92(@OriginalArg(0) Class389 arg0) {
		@Pc(20) Class163 local20 = arg0.method9276(this, 5);
		while (local20.anInt3843 == 0) {
			Static570.method7907(10L);
		}
		if (local20.anInt3843 == 2) {
			throw new RuntimeException();
		}
		this.aThread3 = (Thread) local20.anObject5;
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(ZLclient!ufa;)V")
	private void method1896(@OriginalArg(1) Class2_Sub6_Sub1_Sub2 arg0) {
		@Pc(11) Class388 local11 = this.aClass388_3;
		synchronized (this.aClass388_3) {
			this.aClass388_3.method9215(arg0);
			this.anInt2156++;
			this.aClass388_3.notifyAll();
		}
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(Lclient!wia;II)Lclient!ufa;")
	public Class2_Sub6_Sub1_Sub2 method1897(@OriginalArg(0) Class402 arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class2_Sub6_Sub1_Sub2 local9 = new Class2_Sub6_Sub1_Sub2();
		local9.anInt9867 = 1;
		@Pc(15) Class388 local15 = this.aClass388_3;
		synchronized (this.aClass388_3) {
			@Pc(23) Class2_Sub6_Sub1_Sub2 local23 = (Class2_Sub6_Sub1_Sub2) this.aClass388_3.method9213();
			while (true) {
				if (local23 == null) {
					break;
				}
				if ((long) arg1 == local23.aLong311 && arg0 == local23.aClass402_4 && local23.anInt9867 == 2) {
					local9.aByteArray113 = local23.aByteArray113;
					local9.aBoolean842 = false;
					return local9;
				}
				local23 = (Class2_Sub6_Sub1_Sub2) this.aClass388_3.method9212();
			}
		}
		local9.aByteArray113 = arg0.method9473(arg1);
		local9.aBoolean843 = true;
		local9.aBoolean842 = false;
		return local9;
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(Z)V")
	public void method1898() {
		this.aBoolean239 = true;
		@Pc(9) Class388 local9 = this.aClass388_3;
		synchronized (this.aClass388_3) {
			this.aClass388_3.notifyAll();
		}
		try {
			this.aThread3.join();
		} catch (@Pc(25) InterruptedException local25) {
		}
		this.aThread3 = null;
	}

	@OriginalMember(owner = "client!dw", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean239) {
			@Pc(6) Class388 local6 = this.aClass388_3;
			@Pc(14) Class2_Sub6_Sub1_Sub2 local14;
			synchronized (this.aClass388_3) {
				local14 = (Class2_Sub6_Sub1_Sub2) this.aClass388_3.method9216();
				if (local14 == null) {
					try {
						this.aClass388_3.wait();
					} catch (@Pc(32) InterruptedException local32) {
					}
					continue;
				}
				this.anInt2156--;
			}
			try {
				if (local14.anInt9867 == 2) {
					local14.aClass402_4.method9472(local14.aByteArray113.length, (int) local14.aLong311, local14.aByteArray113);
				} else if (local14.anInt9867 == 3) {
					local14.aByteArray113 = local14.aClass402_4.method9473((int) local14.aLong311);
				}
			} catch (@Pc(79) Exception local79) {
				Static329.method4572((String) null, local79);
			}
			local14.aBoolean842 = false;
		}
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "([BLclient!wia;II)Lclient!ufa;")
	public Class2_Sub6_Sub1_Sub2 method1900(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class402 arg1, @OriginalArg(2) int arg2) {
		@Pc(13) Class2_Sub6_Sub1_Sub2 local13 = new Class2_Sub6_Sub1_Sub2();
		local13.aBoolean843 = false;
		local13.aLong311 = (long) arg2;
		local13.aByteArray113 = arg0;
		local13.anInt9867 = 2;
		local13.aClass402_4 = arg1;
		this.method1896(local13);
		return local13;
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(IBLclient!wia;)Lclient!ufa;")
	public Class2_Sub6_Sub1_Sub2 method1901(@OriginalArg(0) int arg0, @OriginalArg(2) Class402 arg1) {
		@Pc(19) Class2_Sub6_Sub1_Sub2 local19 = new Class2_Sub6_Sub1_Sub2();
		local19.anInt9867 = 3;
		local19.aBoolean843 = false;
		local19.aLong311 = (long) arg0;
		local19.aClass402_4 = arg1;
		this.method1896(local19);
		return local19;
	}
}
