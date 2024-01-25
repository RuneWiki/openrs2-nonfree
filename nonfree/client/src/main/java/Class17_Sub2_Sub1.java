import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bm")
public final class Class17_Sub2_Sub1 extends Class17_Sub2 {

	@OriginalMember(owner = "client!bm", name = "y", descriptor = "I")
	public int anInt1000;

	@OriginalMember(owner = "client!bm", name = "z", descriptor = "I")
	public int anInt1001;

	@OriginalMember(owner = "client!bm", name = "A", descriptor = "I")
	public int anInt1002;

	@OriginalMember(owner = "client!bm", name = "B", descriptor = "I")
	public int anInt1003;

	@OriginalMember(owner = "client!bm", name = "F", descriptor = "I")
	public int anInt1007 = -1;

	@OriginalMember(owner = "client!bm", name = "G", descriptor = "I")
	public int anInt1008 = -1;

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(BLclient!uo;)V")
	@Override
	public void method4787(@OriginalArg(1) Class32 arg0) {
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lclient!uo;IIZ)Z")
	@Override
	public boolean method4783(@OriginalArg(0) Class32 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class109 local6 = arg0.method2194();
		local6.method3873(super.anInt997, super.anInt988, super.anInt995);
		@Pc(35) Class73 local35 = Static20.method561(this.anInt1000).method2995(0, null, null, this.anInt1001, 0, 65536, -1, arg0);
		if (local35 != null && local35.method3326(arg1, arg2, local6, true)) {
			return true;
		}
		if (this.anInt1007 != -1) {
			local35 = Static20.method561(this.anInt1007).method2995(0, null, null, this.anInt1003, 0, 65536, -1, arg0);
			if (local35 != null && local35.method3326(arg1, arg2, local6, true)) {
				return true;
			}
		}
		if (this.anInt1008 != -1) {
			local35 = Static20.method561(this.anInt1008).method2995(0, null, null, this.anInt1002, 0, 65536, -1, arg0);
			if (local35 != null && local35.method3326(arg1, arg2, local6, true)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!bm", name = "c", descriptor = "(Lclient!uo;B)Lclient!kj;")
	@Override
	public Class8_Sub5 method4779(@OriginalArg(0) Class32 arg0) {
		@Pc(14) Class109 local14 = arg0.method2194();
		local14.method3873(super.anInt997, super.anInt988, super.anInt995);
		@Pc(26) Class8_Sub5 local26 = Static239.method4367(3);
		@Pc(46) Class73 local46;
		if (this.anInt1008 != -1) {
			local46 = Static20.method561(this.anInt1008).method2995(0, null, null, this.anInt1002, 0, 1024, -1, arg0);
			if (local46 != null) {
				local46.method3322(local14, local26.aClass8_Sub3Array1[2], 0);
			}
		}
		if (this.anInt1007 != -1) {
			local46 = Static20.method561(this.anInt1007).method2995(0, null, null, this.anInt1003, 0, 1024, -1, arg0);
			if (local46 != null) {
				local46.method3322(local14, local26.aClass8_Sub3Array1[1], 0);
			}
		}
		local46 = Static20.method561(this.anInt1000).method2995(0, null, null, this.anInt1001, 0, 1024, -1, arg0);
		if (local46 != null) {
			local46.method3322(local14, local26.aClass8_Sub3Array1[0], 0);
		}
		return local26;
	}
}
