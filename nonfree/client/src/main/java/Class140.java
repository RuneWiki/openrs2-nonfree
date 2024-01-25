import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public final class Class140 {

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "I")
	public int anInt4239;

	@OriginalMember(owner = "client!nr", name = "f", descriptor = "I")
	public int anInt4242;

	@OriginalMember(owner = "client!nr", name = "i", descriptor = "I")
	public int anInt4244;

	@OriginalMember(owner = "client!nr", name = "j", descriptor = "I")
	public int anInt4245;

	@OriginalMember(owner = "client!nr", name = "k", descriptor = "I")
	public int anInt4246;

	@OriginalMember(owner = "client!nr", name = "l", descriptor = "I")
	public int anInt4247;

	@OriginalMember(owner = "client!nr", name = "o", descriptor = "Lclient!nr;")
	public Class140 aClass140_1;

	@OriginalMember(owner = "client!nr", name = "q", descriptor = "I")
	public int anInt4251;

	@OriginalMember(owner = "client!nr", name = "r", descriptor = "I")
	public int anInt4252;

	@OriginalMember(owner = "client!nr", name = "s", descriptor = "I")
	public int anInt4253;

	@OriginalMember(owner = "client!nr", name = "h", descriptor = "B")
	public final byte aByte49;

	@OriginalMember(owner = "client!nr", name = "m", descriptor = "I")
	public final int anInt4248;

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "I")
	public final int anInt4240;

	@OriginalMember(owner = "client!nr", name = "t", descriptor = "I")
	public final int anInt4254;

	@OriginalMember(owner = "client!nr", name = "e", descriptor = "I")
	public final int anInt4241;

	@OriginalMember(owner = "client!nr", name = "<init>", descriptor = "(IIIIB)V")
	public Class140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.aByte49 = arg4;
		this.anInt4248 = arg1;
		this.anInt4240 = arg2;
		this.anInt4254 = arg0;
		this.anInt4241 = arg3;
	}

	@OriginalMember(owner = "client!nr", name = "<init>", descriptor = "(Lclient!nr;I)V")
	public Class140(@OriginalArg(0) Class140 arg0, @OriginalArg(1) int arg1) {
		this.aClass140_1 = arg0;
		this.anInt4254 = this.aClass140_1.anInt4254;
		this.anInt4248 = this.aClass140_1.anInt4248 + arg1;
		this.anInt4240 = arg1 + this.aClass140_1.anInt4240;
		this.anInt4241 = arg1 + this.aClass140_1.anInt4241;
		this.aByte49 = this.aClass140_1.aByte49;
	}
}
