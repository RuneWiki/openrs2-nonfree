import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cn")
public final class Class32 implements Runnable {

	@OriginalMember(owner = "client!cn", name = "m", descriptor = "Lclient!ad;")
	private Class5 aClass5_1 = new Class5();

	@OriginalMember(owner = "client!cn", name = "p", descriptor = "Z")
	private boolean aBoolean63 = false;

	@OriginalMember(owner = "client!cn", name = "q", descriptor = "I")
	public int anInt774 = 0;

	@OriginalMember(owner = "client!cn", name = "o", descriptor = "Ljava/lang/Thread;")
	private Thread aThread1;

	@OriginalMember(owner = "client!cn", name = "<init>", descriptor = "()V")
	public Class32() {
		@Pc(20) Class10 local20 = Static117.aClass117_3.method3000(5, this);
		while (local20.anInt151 == 0) {
			Static202.method3246(10L);
		}
		if (local20.anInt151 == 2) {
			throw new RuntimeException();
		}
		this.aThread1 = (Thread) local20.anObject1;
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(IILclient!nm;)Lclient!ra;")
	public Class1_Sub1_Sub11_Sub2 method682(@OriginalArg(0) int arg0, @OriginalArg(2) Class120 arg1) {
		@Pc(15) Class1_Sub1_Sub11_Sub2 local15 = new Class1_Sub1_Sub11_Sub2();
		local15.anInt4763 = 1;
		@Pc(22) Class5 local22 = this.aClass5_1;
		synchronized (this.aClass5_1) {
			@Pc(29) Class1_Sub1_Sub11_Sub2 local29 = (Class1_Sub1_Sub11_Sub2) this.aClass5_1.method49();
			while (true) {
				if (local29 == null) {
					break;
				}
				if (local29.aLong224 == (long) arg0 && local29.aClass120_2 == arg1 && local29.anInt4763 == 2) {
					local15.aBoolean340 = false;
					local15.aByteArray55 = local29.aByteArray55;
					return local15;
				}
				local29 = (Class1_Sub1_Sub11_Sub2) this.aClass5_1.method51();
			}
		}
		local15.aByteArray55 = arg1.method3072(arg0);
		local15.aBoolean340 = false;
		local15.aBoolean339 = true;
		return local15;
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(ILclient!ra;)V")
	private void method683(@OriginalArg(1) Class1_Sub1_Sub11_Sub2 arg0) {
		@Pc(7) Class5 local7 = this.aClass5_1;
		synchronized (this.aClass5_1) {
			this.aClass5_1.method48(arg0);
			this.anInt774++;
			this.aClass5_1.notifyAll();
		}
	}

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "(B)V")
	public void method684() {
		this.aBoolean63 = true;
		@Pc(6) Class5 local6 = this.aClass5_1;
		synchronized (this.aClass5_1) {
			this.aClass5_1.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(32) InterruptedException local32) {
		}
		this.aThread1 = null;
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(ILclient!nm;[BI)Lclient!ra;")
	public Class1_Sub1_Sub11_Sub2 method685(@OriginalArg(1) Class120 arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class1_Sub1_Sub11_Sub2 local12 = new Class1_Sub1_Sub11_Sub2();
		local12.aClass120_2 = arg0;
		local12.anInt4763 = 2;
		local12.aBoolean339 = false;
		local12.aLong224 = arg2;
		local12.aByteArray55 = arg1;
		this.method683(local12);
		return local12;
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(ILclient!nm;I)Lclient!ra;")
	public Class1_Sub1_Sub11_Sub2 method687(@OriginalArg(0) int arg0, @OriginalArg(1) Class120 arg1) {
		@Pc(3) Class1_Sub1_Sub11_Sub2 local3 = new Class1_Sub1_Sub11_Sub2();
		local3.aClass120_2 = arg1;
		local3.anInt4763 = 3;
		local3.aBoolean339 = false;
		local3.aLong224 = arg0;
		this.method683(local3);
		return local3;
	}

	@OriginalMember(owner = "client!cn", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean63) {
			@Pc(8) Class5 local8 = this.aClass5_1;
			@Pc(15) Class1_Sub1_Sub11_Sub2 local15;
			synchronized (this.aClass5_1) {
				local15 = (Class1_Sub1_Sub11_Sub2) this.aClass5_1.method53();
				if (local15 == null) {
					try {
						this.aClass5_1.wait();
					} catch (@Pc(30) InterruptedException local30) {
					}
					continue;
				}
				this.anInt774--;
			}
			try {
				if (local15.anInt4763 == 2) {
					local15.aClass120_2.method3074(local15.aByteArray55, local15.aByteArray55.length, (int) local15.aLong224);
				} else if (local15.anInt4763 == 3) {
					local15.aByteArray55 = local15.aClass120_2.method3072((int) local15.aLong224);
				}
			} catch (@Pc(80) Exception local80) {
				Static195.method3178(null, local80);
			}
			local15.aBoolean340 = false;
		}
	}
}
