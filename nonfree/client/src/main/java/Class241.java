import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public final class Class241 {

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "I")
	public int anInt6255;

	@OriginalMember(owner = "client!vq", name = "d", descriptor = "I")
	public int anInt6257;

	@OriginalMember(owner = "client!vq", name = "h", descriptor = "Lclient!vq;")
	public Class241 aClass241_2;

	@OriginalMember(owner = "client!vq", name = "i", descriptor = "I")
	public int anInt6260;

	@OriginalMember(owner = "client!vq", name = "j", descriptor = "I")
	public int anInt6261;

	@OriginalMember(owner = "client!vq", name = "l", descriptor = "I")
	public int anInt6262;

	@OriginalMember(owner = "client!vq", name = "m", descriptor = "I")
	public int anInt6263;

	@OriginalMember(owner = "client!vq", name = "n", descriptor = "I")
	public int anInt6264;

	@OriginalMember(owner = "client!vq", name = "p", descriptor = "I")
	public int anInt6266;

	@OriginalMember(owner = "client!vq", name = "s", descriptor = "I")
	public int anInt6268;

	@OriginalMember(owner = "client!vq", name = "g", descriptor = "B")
	public final byte aByte78;

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "I")
	public final int anInt6254;

	@OriginalMember(owner = "client!vq", name = "f", descriptor = "I")
	public final int anInt6259;

	@OriginalMember(owner = "client!vq", name = "e", descriptor = "I")
	public final int anInt6258;

	@OriginalMember(owner = "client!vq", name = "t", descriptor = "I")
	public final int anInt6269;

	@OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(IIIIB)V")
	public Class241(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.aByte78 = arg4;
		this.anInt6254 = arg3;
		this.anInt6259 = arg1;
		this.anInt6258 = arg2;
		this.anInt6269 = arg0;
	}

	@OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(Lclient!vq;I)V")
	public Class241(@OriginalArg(0) Class241 arg0, @OriginalArg(1) int arg1) {
		this.aClass241_2 = arg0;
		this.aByte78 = this.aClass241_2.aByte78;
		this.anInt6254 = arg1 + this.aClass241_2.anInt6254;
		this.anInt6269 = this.aClass241_2.anInt6269;
		this.anInt6258 = this.aClass241_2.anInt6258 + arg1;
		this.anInt6259 = arg1 + this.aClass241_2.anInt6259;
	}
}
