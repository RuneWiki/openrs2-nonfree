import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!il")
public final class Class8_Sub3_Sub1 extends Class8_Sub3 {

	@OriginalMember(owner = "client!il", name = "z", descriptor = "I")
	public int anInt3146;

	@OriginalMember(owner = "client!il", name = "C", descriptor = "I")
	public int anInt3148;

	@OriginalMember(owner = "client!il", name = "F", descriptor = "I")
	public int anInt3151;

	@OriginalMember(owner = "client!il", name = "O", descriptor = "I")
	public int anInt3157;

	@OriginalMember(owner = "client!il", name = "G", descriptor = "I")
	public int anInt3152 = -1;

	@OriginalMember(owner = "client!il", name = "N", descriptor = "I")
	public int anInt3156 = -1;

	static {
		new Class159("clan_chat", "clanchat", "conversation_clan", "clan_chat");
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(BLclient!vq;)Lclient!bf;")
	@Override
	public Class2_Sub2 method5624(@OriginalArg(1) Class47 arg0) {
		@Pc(6) Class57 local6 = arg0.method2706();
		local6.method4189(super.anInt3145, super.anInt3142, super.anInt3138);
		@Pc(18) Class2_Sub2 local18 = Static248.method4393(3);
		@Pc(46) Class38 local46;
		if (this.anInt3156 != -1) {
			local46 = Static177.method3465(this.anInt3156).method5459(arg0, null, 1024, 0, 0, this.anInt3148, null, -1);
			if (local46 != null) {
				local46.method1925(local6, local18.aClass2_Sub5Array1[2], 0);
			}
		}
		if (this.anInt3152 != -1) {
			local46 = Static177.method3465(this.anInt3152).method5459(arg0, null, 1024, 0, 0, this.anInt3151, null, -1);
			if (local46 != null) {
				local46.method1925(local6, local18.aClass2_Sub5Array1[1], 0);
			}
		}
		local46 = Static177.method3465(this.anInt3146).method5459(arg0, null, 1024, 0, 0, this.anInt3157, null, -1);
		if (local46 != null) {
			local46.method1925(local6, local18.aClass2_Sub5Array1[0], 0);
		}
		return local18;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(Lclient!vq;IIB)Z")
	@Override
	public boolean method5623(@OriginalArg(0) Class47 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class57 local6 = arg0.method2706();
		local6.method4189(super.anInt3145, super.anInt3142, super.anInt3138);
		@Pc(30) Class38 local30 = Static177.method3465(this.anInt3146).method5459(arg0, null, 65536, 0, 0, this.anInt3157, null, -1);
		if (local30 != null && local30.method1905(arg1, arg2, local6, true)) {
			return true;
		}
		if (this.anInt3152 != -1) {
			local30 = Static177.method3465(this.anInt3152).method5459(arg0, null, 65536, 0, 0, this.anInt3151, null, -1);
			if (local30 != null && local30.method1905(arg1, arg2, local6, true)) {
				return true;
			}
		}
		if (this.anInt3156 != -1) {
			local30 = Static177.method3465(this.anInt3156).method5459(arg0, null, 65536, 0, 0, this.anInt3148, null, -1);
			if (local30 != null && local30.method1905(arg1, arg2, local6, true)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(Lclient!vq;B)V")
	@Override
	public void method5627(@OriginalArg(0) Class47 arg0) {
	}
}
