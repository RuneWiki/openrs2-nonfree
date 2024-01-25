import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aw")
public final class Class22 {

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "Lclient!fc;")
	public Class4_Sub16_Sub1 aClass4_Sub16_Sub1_1;

	@OriginalMember(owner = "client!aw", name = "l", descriptor = "Lclient!in;")
	public Class4_Sub13_Sub2 aClass4_Sub13_Sub2_1;

	@OriginalMember(owner = "client!aw", name = "m", descriptor = "Lclient!jda;")
	public Class4_Sub24 aClass4_Sub24_1;

	@OriginalMember(owner = "client!aw", name = "p", descriptor = "Lclient!qba;")
	public Class277 aClass277_1;

	@OriginalMember(owner = "client!aw", name = "h", descriptor = "I")
	public final int anInt463;

	@OriginalMember(owner = "client!aw", name = "q", descriptor = "I")
	public final int anInt467;

	@OriginalMember(owner = "client!aw", name = "n", descriptor = "B")
	public final byte aByte5;

	@OriginalMember(owner = "client!aw", name = "i", descriptor = "I")
	public final int anInt464;

	@OriginalMember(owner = "client!aw", name = "o", descriptor = "I")
	public int anInt466;

	@OriginalMember(owner = "client!aw", name = "c", descriptor = "I")
	public final int anInt458;

	@OriginalMember(owner = "client!aw", name = "<init>", descriptor = "(BIIIII)V")
	public Class22(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt463 = arg1;
		this.anInt467 = arg2;
		this.aByte5 = arg0;
		this.anInt464 = arg5;
		this.anInt466 = arg3;
		this.anInt458 = arg4;
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(I)Z")
	public boolean method446() {
		return this.aByte5 == 2 || this.aByte5 == 3;
	}
}
