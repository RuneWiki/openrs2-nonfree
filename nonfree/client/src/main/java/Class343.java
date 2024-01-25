import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vba")
public final class Class343 {

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "I")
	private int anInt9226 = -1;

	@OriginalMember(owner = "client!vba", name = "j", descriptor = "I")
	private int anInt9230 = 0;

	@OriginalMember(owner = "client!vba", name = "h", descriptor = "Lclient!gj;")
	private Class124 aClass124_63 = new Class124();

	@OriginalMember(owner = "client!vba", name = "p", descriptor = "Z")
	public boolean aBoolean638 = false;

	@OriginalMember(owner = "client!vba", name = "o", descriptor = "I")
	private final int anInt9233;

	@OriginalMember(owner = "client!vba", name = "m", descriptor = "I")
	private final int anInt9231;

	@OriginalMember(owner = "client!vba", name = "i", descriptor = "[Lclient!lh;")
	private Class4_Sub28[] aClass4_Sub28Array1;

	@OriginalMember(owner = "client!vba", name = "c", descriptor = "[[I")
	private int[][] anIntArrayArray76;

	@OriginalMember(owner = "client!vba", name = "<init>", descriptor = "(III)V")
	public Class343(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt9233 = arg0;
		this.anInt9231 = arg1;
		this.aClass4_Sub28Array1 = new Class4_Sub28[this.anInt9231];
		this.anIntArrayArray76 = new int[this.anInt9233][arg2];
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(B)[[I")
	public int[][] method7592() {
		if (this.anInt9233 != this.anInt9231) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(23) int local23 = 0; local23 < this.anInt9233; local23++) {
			this.aClass4_Sub28Array1[local23] = Static73.aClass4_Sub28_1;
		}
		return this.anIntArrayArray76;
	}

	@OriginalMember(owner = "client!vba", name = "b", descriptor = "(B)V")
	public void method7593() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt9233; local3++) {
			this.anIntArrayArray76[local3] = null;
		}
		this.aClass4_Sub28Array1 = null;
		this.anIntArrayArray76 = null;
		this.aClass124_63.method3265();
		this.aClass124_63 = null;
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(II)[I")
	public int[] method7596(@OriginalArg(0) int arg0) {
		if (this.anInt9233 == this.anInt9231) {
			this.aBoolean638 = this.aClass4_Sub28Array1[arg0] == null;
			this.aClass4_Sub28Array1[arg0] = Static73.aClass4_Sub28_1;
			return this.anIntArrayArray76[arg0];
		} else if (this.anInt9233 == 1) {
			this.aBoolean638 = this.anInt9226 != arg0;
			this.anInt9226 = arg0;
			return this.anIntArrayArray76[0];
		} else {
			@Pc(48) Class4_Sub28 local48 = this.aClass4_Sub28Array1[arg0];
			if (local48 == null) {
				this.aBoolean638 = true;
				if (this.anInt9233 > this.anInt9230) {
					local48 = new Class4_Sub28(arg0, this.anInt9230);
					this.anInt9230++;
				} else {
					@Pc(88) Class4_Sub28 local88 = (Class4_Sub28) this.aClass124_63.method3274();
					local48 = new Class4_Sub28(arg0, local88.anInt5482);
					this.aClass4_Sub28Array1[local88.anInt5483] = null;
					local88.method8013();
				}
				this.aClass4_Sub28Array1[arg0] = local48;
			} else {
				this.aBoolean638 = false;
			}
			this.aClass124_63.method3268(local48);
			return this.anIntArrayArray76[local48.anInt5482];
		}
	}
}
