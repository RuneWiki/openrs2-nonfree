import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!laa")
public class Class6 implements Interface24 {

	@OriginalMember(owner = "client!laa", name = "b", descriptor = "Lclient!cu;")
	public final Class60 aClass60_13;

	@OriginalMember(owner = "client!laa", name = "o", descriptor = "I")
	public final int anInt10342;

	@OriginalMember(owner = "client!laa", name = "d", descriptor = "I")
	public final int anInt10334;

	@OriginalMember(owner = "client!laa", name = "i", descriptor = "I")
	public final int anInt10337;

	@OriginalMember(owner = "client!laa", name = "f", descriptor = "I")
	public final int anInt10335;

	@OriginalMember(owner = "client!laa", name = "g", descriptor = "I")
	public final int anInt10336;

	@OriginalMember(owner = "client!laa", name = "l", descriptor = "I")
	public final int anInt10339;

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "I")
	public final int anInt10332;

	@OriginalMember(owner = "client!laa", name = "j", descriptor = "Lclient!kda;")
	public final Class173 aClass173_14;

	@OriginalMember(owner = "client!laa", name = "<init>", descriptor = "(Lclient!kda;Lclient!cu;IIIIIII)V")
	public Class6(@OriginalArg(0) Class173 arg0, @OriginalArg(1) Class60 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.aClass60_13 = arg1;
		this.anInt10342 = arg7;
		this.anInt10334 = arg3;
		this.anInt10337 = arg8;
		this.anInt10335 = arg4;
		this.anInt10336 = arg5;
		this.anInt10339 = arg6;
		this.anInt10332 = arg2;
		this.aClass173_14 = arg0;
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(I)Lclient!hs;")
	@Override
	public Class138 method8348() {
		return null;
	}
}
