import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public final class Class126 implements Interface4 {

	@OriginalMember(owner = "client!ge", name = "f", descriptor = "I")
	public final int anInt3875;

	@OriginalMember(owner = "client!ge", name = "l", descriptor = "Lclient!jha;")
	public final Class176 aClass176_6;

	@OriginalMember(owner = "client!ge", name = "o", descriptor = "I")
	public final int anInt3882;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "I")
	public final int anInt3871;

	@OriginalMember(owner = "client!ge", name = "e", descriptor = "I")
	public final int anInt3874;

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "Z")
	public final boolean aBoolean329;

	@OriginalMember(owner = "client!ge", name = "i", descriptor = "I")
	public final int anInt3878;

	@OriginalMember(owner = "client!ge", name = "n", descriptor = "Lclient!jg;")
	public final Class174 aClass174_6;

	@OriginalMember(owner = "client!ge", name = "r", descriptor = "I")
	public final int anInt3885;

	@OriginalMember(owner = "client!ge", name = "j", descriptor = "I")
	public final int anInt3879;

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "I")
	public final int anInt3873;

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(ILclient!jg;Lclient!jha;IIIIIIIZ)V")
	public Class126(@OriginalArg(0) int arg0, @OriginalArg(1) Class174 arg1, @OriginalArg(2) Class176 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		this.anInt3875 = arg9;
		this.aClass176_6 = arg2;
		this.anInt3882 = arg4;
		this.anInt3871 = arg3;
		this.anInt3874 = arg5;
		this.aBoolean329 = arg10;
		this.anInt3878 = arg6;
		this.aClass174_6 = arg1;
		this.anInt3885 = arg8;
		this.anInt3879 = arg7;
		this.anInt3873 = arg0;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)Lclient!jw;")
	@Override
	public Class184 method7078() {
		return Static374.aClass184_8;
	}
}
