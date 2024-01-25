import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rq")
public final class Class67_Sub5_Sub1 extends Class67_Sub5 {

	@OriginalMember(owner = "client!rq", name = "z", descriptor = "I")
	public int anInt5548;

	@OriginalMember(owner = "client!rq", name = "E", descriptor = "I")
	public int anInt5552;

	@OriginalMember(owner = "client!rq", name = "L", descriptor = "I")
	public int anInt5557;

	@OriginalMember(owner = "client!rq", name = "P", descriptor = "I")
	public int anInt5561;

	@OriginalMember(owner = "client!rq", name = "I", descriptor = "I")
	public int anInt5554 = -1;

	@OriginalMember(owner = "client!rq", name = "M", descriptor = "I")
	public int anInt5558 = -1;

	@OriginalMember(owner = "client!rq", name = "b", descriptor = "(Lclient!uo;I)V")
	@Override
	public void method5395(@OriginalArg(0) Class129 arg0) {
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(IILclient!uo;I)Z")
	@Override
	public boolean method5400(@OriginalArg(0) int arg0, @OriginalArg(2) Class129 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class61 local6 = arg1.method4979();
		local6.method3666(super.anInt5540, super.anInt5537, super.anInt5542);
		@Pc(30) Class126 local30 = Static283.method4717(this.anInt5548).method4528(arg1, null, 65536, this.anInt5561, 0, -1, 0, null);
		if (local30 != null && local30.method3160(arg2, arg0, local6, true)) {
			return true;
		}
		if (this.anInt5558 != -1) {
			local30 = Static283.method4717(this.anInt5558).method4528(arg1, null, 65536, this.anInt5557, 0, -1, 0, null);
			if (local30 != null && local30.method3160(arg2, arg0, local6, true)) {
				return true;
			}
		}
		if (this.anInt5554 != -1) {
			local30 = Static283.method4717(this.anInt5554).method4528(arg1, null, 65536, this.anInt5552, 0, -1, 0, null);
			if (local30 != null && local30.method3160(arg2, arg0, local6, true)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(ZLclient!uo;)Lclient!aj;")
	@Override
	public Class10_Sub1 method5401(@OriginalArg(1) Class129 arg0) {
		@Pc(6) Class61 local6 = arg0.method4979();
		local6.method3666(super.anInt5540, super.anInt5537, super.anInt5542);
		@Pc(18) Class10_Sub1 local18 = Static55.method830(3);
		@Pc(38) Class126 local38;
		if (this.anInt5554 != -1) {
			local38 = Static283.method4717(this.anInt5554).method4528(arg0, null, 1024, this.anInt5552, 0, -1, 0, null);
			if (local38 != null) {
				local38.method3139(local6, local18.aClass10_Sub8Array1[2], 0);
			}
		}
		if (this.anInt5558 != -1) {
			local38 = Static283.method4717(this.anInt5558).method4528(arg0, null, 1024, this.anInt5557, 0, -1, 0, null);
			if (local38 != null) {
				local38.method3139(local6, local18.aClass10_Sub8Array1[1], 0);
			}
		}
		local38 = Static283.method4717(this.anInt5548).method4528(arg0, null, 1024, this.anInt5561, 0, -1, 0, null);
		if (local38 != null) {
			local38.method3139(local6, local18.aClass10_Sub8Array1[0], 0);
		}
		return local18;
	}
}
