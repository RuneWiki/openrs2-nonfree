import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public final class Class72 {

	@OriginalMember(owner = "client!ua", name = "k", descriptor = "Lclient!ra;")
	private final Class4_Sub4 aClass4_Sub4_59 = new Class4_Sub4();

	@OriginalMember(owner = "client!ua", name = "o", descriptor = "Lclient!wf;")
	private final Class83 aClass83_2 = new Class83();

	@OriginalMember(owner = "client!ua", name = "r", descriptor = "I")
	private int anInt2543;

	@OriginalMember(owner = "client!ua", name = "q", descriptor = "I")
	private final int anInt2542;

	@OriginalMember(owner = "client!ua", name = "s", descriptor = "Lclient!gf;")
	private final Class28 aClass28_12;

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(I)V")
	public Class72(@OriginalArg(0) int arg0) {
		@Pc(13) int local13 = 1;
		this.anInt2543 = arg0;
		this.anInt2542 = arg0;
		while (local13 + local13 < arg0) {
			local13 += local13;
		}
		this.aClass28_12 = new Class28(local13);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(JI)Lclient!ra;")
	public Class4_Sub4 method1781(@OriginalArg(0) long arg0) {
		@Pc(18) Class4_Sub4 local18 = (Class4_Sub4) this.aClass28_12.method770(arg0);
		if (local18 != null) {
			this.aClass83_2.method2021(local18);
		}
		return local18;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILclient!ra;J)V")
	public void method1783(@OriginalArg(1) Class4_Sub4 arg0, @OriginalArg(2) long arg1) {
		if (this.anInt2543 == 0) {
			@Pc(18) Class4_Sub4 local18 = this.aClass83_2.method2022();
			local18.method2004();
			local18.method1944();
			if (local18 == this.aClass4_Sub4_59) {
				local18 = this.aClass83_2.method2022();
				local18.method2004();
				local18.method1944();
			}
		} else {
			this.anInt2543--;
		}
		this.aClass28_12.method774(arg1, arg0);
		this.aClass83_2.method2021(arg0);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(JZ)V")
	public void method1784(@OriginalArg(0) long arg0) {
		@Pc(10) Class4_Sub4 local10 = (Class4_Sub4) this.aClass28_12.method770(arg0);
		if (local10 != null) {
			local10.method2004();
			local10.method1944();
			this.anInt2543++;
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Z)V")
	public void method1786() {
		while (true) {
			@Pc(10) Class4_Sub4 local10 = this.aClass83_2.method2022();
			if (local10 == null) {
				this.anInt2543 = this.anInt2542;
				return;
			}
			local10.method2004();
			local10.method1944();
		}
	}
}
