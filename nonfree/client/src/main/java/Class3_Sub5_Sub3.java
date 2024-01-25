import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public final class Class3_Sub5_Sub3 extends Class3_Sub5 implements Interface10 {

	@OriginalMember(owner = "client!ol", name = "o", descriptor = "Lclient!fg;")
	public Class3_Sub5 aClass3_Sub5_2;

	static {
		new Class267(null, "Mitglieder können 200 Freunde hinzufügen, freie Spieler nur 100.", null, null);
	}

	@OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(IIILclient!fg;)V")
	public Class3_Sub5_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class3_Sub5 arg3) {
		super(arg0, arg1, arg2, false, false);
		this.aClass3_Sub5_2 = arg3;
	}

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "(Lclient!eq;Z)Lclient!gl;")
	@Override
	public Class57_Sub2 method5936(@OriginalArg(0) Class66 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(B)I")
	@Override
	public int method5325() {
		return 0;
	}

	@OriginalMember(owner = "client!ol", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method5942() {
		return false;
	}

	@OriginalMember(owner = "client!ol", name = "c", descriptor = "(I)V")
	@Override
	public void method5938() {
	}

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "(B)I")
	@Override
	public int method5327() {
		return 0;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5326() {
		return false;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lclient!eq;I)V")
	@Override
	public void method5937(@OriginalArg(0) Class66 arg0) {
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(ILclient!eq;BI)Z")
	@Override
	public boolean method5939(@OriginalArg(0) int arg0, @OriginalArg(1) Class66 arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIILclient!bp;IZLclient!eq;)V")
	@Override
	public void method5941(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class3 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) Class66 arg5) {
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lclient!eq;Z)V")
	@Override
	public void method5320(@OriginalArg(0) Class66 arg0) {
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(ILclient!eq;Z)Lclient!va;")
	@Override
	public Class224 method5323(@OriginalArg(0) int arg0, @OriginalArg(1) Class66 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "(I)V")
	@Override
	public void method5324() {
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(BLclient!eq;)V")
	@Override
	public void method5322(@OriginalArg(1) Class66 arg0) {
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)I")
	@Override
	public int method5321() {
		return 0;
	}
}
