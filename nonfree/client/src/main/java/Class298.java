import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rf")
public final class Class298 implements Runnable {

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "Lclient!dha;")
	private final Class73 aClass73_10 = new Class73();

	@OriginalMember(owner = "client!rf", name = "k", descriptor = "I")
	public int anInt8967 = 0;

	@OriginalMember(owner = "client!rf", name = "m", descriptor = "Z")
	private boolean aBoolean631 = false;

	@OriginalMember(owner = "client!rf", name = "l", descriptor = "Ljava/lang/Thread;")
	private Thread aThread5;

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(Lclient!td;)V")
	public Class298(@OriginalArg(0) Class333 arg0) {
		@Pc(20) Class150 local20 = arg0.method8151(5, this);
		while (local20.anInt4247 == 0) {
			Static20.method9254(10L);
		}
		if (local20.anInt4247 == 2) {
			throw new RuntimeException();
		}
		this.aThread5 = (Thread) local20.anObject8;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IILclient!uaa;)Lclient!ms;")
	public Class14_Sub3_Sub2_Sub2 method7421(@OriginalArg(1) int arg0, @OriginalArg(2) Class345 arg1) {
		@Pc(7) Class14_Sub3_Sub2_Sub2 local7 = new Class14_Sub3_Sub2_Sub2();
		local7.aLong302 = (long) arg0;
		local7.aBoolean492 = false;
		local7.aClass345_4 = arg1;
		local7.anInt6920 = 3;
		this.method7422(local7);
		return local7;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(ILclient!ms;)V")
	private void method7422(@OriginalArg(1) Class14_Sub3_Sub2_Sub2 arg0) {
		@Pc(2) Class73 local2 = this.aClass73_10;
		synchronized (this.aClass73_10) {
			this.aClass73_10.method1816(arg0);
			this.anInt8967++;
			this.aClass73_10.notifyAll();
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "([BILclient!uaa;I)Lclient!ms;")
	public Class14_Sub3_Sub2_Sub2 method7423(@OriginalArg(0) byte[] arg0, @OriginalArg(2) Class345 arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class14_Sub3_Sub2_Sub2 local7 = new Class14_Sub3_Sub2_Sub2();
		local7.aLong302 = (long) arg2;
		local7.aBoolean492 = false;
		local7.aClass345_4 = arg1;
		local7.anInt6920 = 2;
		local7.aByteArray80 = arg0;
		this.method7422(local7);
		return local7;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!uaa;II)Lclient!ms;")
	public Class14_Sub3_Sub2_Sub2 method7424(@OriginalArg(0) Class345 arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class14_Sub3_Sub2_Sub2 local9 = new Class14_Sub3_Sub2_Sub2();
		local9.anInt6920 = 1;
		@Pc(15) Class73 local15 = this.aClass73_10;
		synchronized (this.aClass73_10) {
			@Pc(25) Class14_Sub3_Sub2_Sub2 local25 = (Class14_Sub3_Sub2_Sub2) this.aClass73_10.method1826();
			while (true) {
				if (local25 == null) {
					break;
				}
				if (local25.aLong302 == (long) arg1 && arg0 == local25.aClass345_4 && local25.anInt6920 == 2) {
					local9.aBoolean494 = false;
					local9.aByteArray80 = local25.aByteArray80;
					return local9;
				}
				local25 = (Class14_Sub3_Sub2_Sub2) this.aClass73_10.method1827();
			}
		}
		local9.aByteArray80 = arg0.method8409(arg1);
		local9.aBoolean494 = false;
		local9.aBoolean492 = true;
		return local9;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)V")
	public void method7425() {
		this.aBoolean631 = true;
		@Pc(9) Class73 local9 = this.aClass73_10;
		synchronized (this.aClass73_10) {
			this.aClass73_10.notifyAll();
		}
		try {
			this.aThread5.join();
		} catch (@Pc(31) InterruptedException local31) {
		}
		this.aThread5 = null;
	}

	@OriginalMember(owner = "client!rf", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean631) {
			@Pc(10) Class73 local10 = this.aClass73_10;
			@Pc(18) Class14_Sub3_Sub2_Sub2 local18;
			synchronized (this.aClass73_10) {
				local18 = (Class14_Sub3_Sub2_Sub2) this.aClass73_10.method1823();
				if (local18 == null) {
					try {
						this.aClass73_10.wait();
					} catch (@Pc(33) InterruptedException local33) {
					}
					continue;
				}
				this.anInt8967--;
			}
			try {
				if (local18.anInt6920 == 2) {
					local18.aClass345_4.method8412((int) local18.aLong302, local18.aByteArray80, local18.aByteArray80.length);
				} else if (local18.anInt6920 == 3) {
					local18.aByteArray80 = local18.aClass345_4.method8409((int) local18.aLong302);
				}
			} catch (@Pc(80) Exception local80) {
				Static524.method7532((String) null, local80);
			}
			local18.aBoolean494 = false;
		}
	}
}
