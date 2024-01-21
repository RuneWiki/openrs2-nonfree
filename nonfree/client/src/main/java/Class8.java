import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bb")
public final class Class8 {

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "Lclient!ha;")
	private final Class5_Sub2 aClass5_Sub2_11 = new Class5_Sub2();

	@OriginalMember(owner = "client!bb", name = "t", descriptor = "Lclient!fg;")
	private final Class32 aClass32_1 = new Class32();

	@OriginalMember(owner = "client!bb", name = "x", descriptor = "I")
	private int anInt271;

	@OriginalMember(owner = "client!bb", name = "u", descriptor = "I")
	private final int anInt269;

	@OriginalMember(owner = "client!bb", name = "v", descriptor = "Lclient!oa;")
	private final Class75 aClass75_1;

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(I)V")
	public Class8(@OriginalArg(0) int arg0) {
		this.anInt271 = arg0;
		this.anInt269 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; local19 + local19 < arg0; local19 += local19) {
		}
		this.aClass75_1 = new Class75(local19);
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IJ)Lclient!ha;")
	public Class5_Sub2 method227(@OriginalArg(1) long arg0) {
		@Pc(10) Class5_Sub2 local10 = (Class5_Sub2) this.aClass75_1.method2072(arg0);
		if (local10 != null) {
			this.aClass32_1.method919(local10);
		}
		return local10;
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)Lclient!ej;")
	public Class5 method230() {
		return this.aClass75_1.method2066();
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(JLclient!ha;Z)V")
	public void method232(@OriginalArg(0) long arg0, @OriginalArg(1) Class5_Sub2 arg1) {
		if (this.anInt271 == 0) {
			@Pc(14) Class5_Sub2 local14 = this.aClass32_1.method918();
			local14.method3207();
			local14.method3014();
			if (this.aClass5_Sub2_11 == local14) {
				local14 = this.aClass32_1.method918();
				local14.method3207();
				local14.method3014();
			}
		} else {
			this.anInt271--;
		}
		this.aClass75_1.method2069(arg1, arg0);
		this.aClass32_1.method919(arg1);
	}

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "(I)V")
	public void method233() {
		while (true) {
			@Pc(6) Class5_Sub2 local6 = this.aClass32_1.method918();
			if (local6 == null) {
				this.anInt271 = this.anInt269;
				return;
			}
			local6.method3207();
			local6.method3014();
		}
	}

	@OriginalMember(owner = "client!bb", name = "d", descriptor = "(I)Lclient!ej;")
	public Class5 method234() {
		return this.aClass75_1.method2067();
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(JI)V")
	public void method235(@OriginalArg(0) long arg0) {
		@Pc(17) Class5_Sub2 local17 = (Class5_Sub2) this.aClass75_1.method2072(arg0);
		if (local17 != null) {
			local17.method3207();
			local17.method3014();
			this.anInt271++;
		}
	}
}
