import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wa")
public final class Class88 implements Interface3 {

	@OriginalMember(owner = "client!wa", name = "g", descriptor = "I")
	private int anInt3867 = 50;

	@OriginalMember(owner = "client!wa", name = "q", descriptor = "I")
	private int anInt3874 = 128;

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "Lclient!jg;")
	private final Class44 aClass44_33;

	@OriginalMember(owner = "client!wa", name = "f", descriptor = "Lclient!jg;")
	private final Class44 aClass44_34;

	@OriginalMember(owner = "client!wa", name = "o", descriptor = "Lclient!nb;")
	private Class57 aClass57_31;

	@OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(Lclient!jg;Lclient!jg;II)V")
	public Class88(@OriginalArg(0) Class44 arg0, @OriginalArg(1) Class44 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3874 = arg3;
		this.aClass44_33 = arg0;
		this.aClass44_34 = arg1;
		this.anInt3867 = arg2;
		this.aClass57_31 = new Class57(this.anInt3867);
	}

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "(II)Lclient!hb;")
	private Class3_Sub2_Sub8 method2823(@OriginalArg(1) int arg0) {
		@Pc(18) Class3_Sub2_Sub8 local18 = (Class3_Sub2_Sub8) this.aClass57_31.method1719((long) arg0);
		if (local18 != null) {
			return local18;
		}
		@Pc(29) byte[] local29 = this.aClass44_33.method1624(0, arg0);
		if (local29 == null) {
			return Static44.method874();
		} else {
			@Pc(41) Class3_Sub4 local41 = new Class3_Sub4(local29);
			local18 = new Class3_Sub2_Sub8(local41);
			this.aClass57_31.method1717(local18, (long) arg0);
			return local18;
		}
	}

	@OriginalMember(owner = "client!wa", name = "d", descriptor = "(II)V")
	public void method2824(@OriginalArg(1) int arg0) {
		for (@Pc(11) Class3_Sub2_Sub8 local11 = (Class3_Sub2_Sub8) this.aClass57_31.method1720(); local11 != null; local11 = (Class3_Sub2_Sub8) this.aClass57_31.method1722()) {
			if (local11.aBoolean55) {
				local11.method1062(arg0);
				local11.aBoolean55 = false;
			}
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method2821(@OriginalArg(1) int arg0) {
		return this.method2823(arg0).aBoolean56;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method2820(@OriginalArg(1) int arg0) {
		@Pc(13) Class3_Sub4 local13 = new Class3_Sub4(this.aClass44_33.method1624(0, arg0));
		@Pc(18) Class3_Sub2_Sub8 local18 = new Class3_Sub2_Sub8(local13);
		return local18.method1070(this.aClass44_34, this, this.anInt3874);
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Z)V")
	public void method2825() {
		this.aClass57_31 = new Class57(this.anInt3867);
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIF)[I")
	@Override
	public int[] method2818(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1) {
		@Pc(13) Class3_Sub2_Sub8 local13 = this.method2823(arg0);
		local13.aBoolean55 = true;
		return local13.method1066(this.aClass44_34, arg1, this, this.anInt3874);
	}

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(BI)I")
	@Override
	public int method2819(@OriginalArg(1) int arg0) {
		return this.method2823(arg0).anInt1543;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IZ)Z")
	@Override
	public boolean method2817(@OriginalArg(0) int arg0) {
		return this.anInt3874 == 64 || this.method2823(arg0).anInt1540 == 64;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(BI)Z")
	@Override
	public boolean method2816(@OriginalArg(1) int arg0) {
		return this.method2823(arg0).aBoolean54;
	}

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(II)Z")
	@Override
	public boolean method2822(@OriginalArg(1) int arg0) {
		return this.method2823(arg0).method1065(this, this.aClass44_34);
	}
}
