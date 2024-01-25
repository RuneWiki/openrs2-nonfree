import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public final class Class197 {

	@OriginalMember(owner = "client!tr", name = "c", descriptor = "I")
	public int anInt6239;

	@OriginalMember(owner = "client!tr", name = "d", descriptor = "I")
	public int anInt6240;

	@OriginalMember(owner = "client!tr", name = "f", descriptor = "I")
	public int anInt6242;

	@OriginalMember(owner = "client!tr", name = "h", descriptor = "I")
	public int anInt6244;

	@OriginalMember(owner = "client!tr", name = "j", descriptor = "I")
	public int anInt6246;

	@OriginalMember(owner = "client!tr", name = "k", descriptor = "I")
	public int anInt6247;

	@OriginalMember(owner = "client!tr", name = "p", descriptor = "Lclient!tr;")
	public Class197 aClass197_2;

	@OriginalMember(owner = "client!tr", name = "r", descriptor = "I")
	public int anInt6252;

	@OriginalMember(owner = "client!tr", name = "s", descriptor = "I")
	public int anInt6253;

	@OriginalMember(owner = "client!tr", name = "t", descriptor = "I")
	public int anInt6254;

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "I")
	public final int anInt6238;

	@OriginalMember(owner = "client!tr", name = "i", descriptor = "I")
	public final int anInt6245;

	@OriginalMember(owner = "client!tr", name = "v", descriptor = "I")
	public final int anInt6256;

	@OriginalMember(owner = "client!tr", name = "b", descriptor = "B")
	public final byte aByte67;

	@OriginalMember(owner = "client!tr", name = "g", descriptor = "I")
	public final int anInt6243;

	@OriginalMember(owner = "client!tr", name = "<init>", descriptor = "(IIIIB)V")
	public Class197(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.anInt6238 = arg2;
		this.anInt6245 = arg1;
		this.anInt6256 = arg0;
		this.aByte67 = arg4;
		this.anInt6243 = arg3;
	}

	@OriginalMember(owner = "client!tr", name = "<init>", descriptor = "(Lclient!tr;I)V")
	public Class197(@OriginalArg(0) Class197 arg0, @OriginalArg(1) int arg1) {
		this.aClass197_2 = arg0;
		this.anInt6256 = this.aClass197_2.anInt6256;
		this.aByte67 = this.aClass197_2.aByte67;
		this.anInt6245 = arg1 + this.aClass197_2.anInt6245;
		this.anInt6243 = this.aClass197_2.anInt6243 + arg1;
		this.anInt6238 = this.aClass197_2.anInt6238 + arg1;
	}
}
