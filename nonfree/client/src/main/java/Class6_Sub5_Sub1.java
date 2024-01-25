import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vp")
public final class Class6_Sub5_Sub1 extends Class6_Sub5 {

	@OriginalMember(owner = "client!vp", name = "q", descriptor = "I")
	public int anInt7152;

	@OriginalMember(owner = "client!vp", name = "s", descriptor = "I")
	public int anInt7154;

	@OriginalMember(owner = "client!vp", name = "u", descriptor = "I")
	public int anInt7155;

	@OriginalMember(owner = "client!vp", name = "x", descriptor = "I")
	public int anInt7158;

	@OriginalMember(owner = "client!vp", name = "v", descriptor = "I")
	public int anInt7156 = -1;

	@OriginalMember(owner = "client!vp", name = "y", descriptor = "I")
	public int anInt7159 = -1;

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(IIILclient!qa;)Z")
	@Override
	public boolean method5631(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class30 arg2) {
		@Pc(6) Class116 local6 = arg2.method4678();
		local6.R(super.anInt7144, super.anInt7148, super.anInt7147);
		@Pc(31) Class7 local31 = Static390.aClass204_2.method4629(this.anInt7152).method2738(131072, null, this.anInt7158, arg2, null, 0, 0, -1);
		if (local31 != null && local31.method4082(arg0, arg1, local6, true)) {
			return true;
		}
		if (this.anInt7159 != -1) {
			local31 = Static390.aClass204_2.method4629(this.anInt7159).method2738(131072, null, this.anInt7154, arg2, null, 0, 0, -1);
			if (local31 != null && local31.method4082(arg0, arg1, local6, true)) {
				return true;
			}
		}
		if (this.anInt7156 != -1) {
			local31 = Static390.aClass204_2.method4629(this.anInt7156).method2738(131072, null, this.anInt7155, arg2, null, 0, 0, -1);
			if (local31 != null && local31.method4082(arg0, arg1, local6, true)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lclient!qa;I)Lclient!pj;")
	@Override
	public Class41_Sub6 method5630(@OriginalArg(0) Class30 arg0) {
		@Pc(6) Class116 local6 = arg0.method4678();
		local6.R(super.anInt7144, super.anInt7148, super.anInt7147);
		@Pc(18) Class41_Sub6 local18 = Static381.method5198(3);
		@Pc(42) Class7 local42;
		if (this.anInt7156 != -1) {
			local42 = Static390.aClass204_2.method4629(this.anInt7156).method2738(2048, null, this.anInt7155, arg0, null, 0, 0, -1);
			if (local42 != null) {
				local42.method4091(local6, local18.aClass41_Sub4Array1[2], 0);
			}
		}
		if (this.anInt7159 != -1) {
			local42 = Static390.aClass204_2.method4629(this.anInt7159).method2738(2048, null, this.anInt7154, arg0, null, 0, 0, -1);
			if (local42 != null) {
				local42.method4091(local6, local18.aClass41_Sub4Array1[1], 0);
			}
		}
		local42 = Static390.aClass204_2.method4629(this.anInt7152).method2738(2048, null, this.anInt7158, arg0, null, 0, 0, -1);
		if (local42 != null) {
			local42.method4091(local6, local18.aClass41_Sub4Array1[0], 0);
		}
		return local18;
	}

	@OriginalMember(owner = "client!vp", name = "b", descriptor = "(BLclient!qa;)V")
	@Override
	public void method5637(@OriginalArg(1) Class30 arg0) {
	}
}
