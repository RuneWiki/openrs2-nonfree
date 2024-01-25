import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iga")
public final class Class160 {

	@OriginalMember(owner = "client!iga", name = "c", descriptor = "I")
	private int anInt4243 = 0;

	@OriginalMember(owner = "client!iga", name = "j", descriptor = "I")
	private int anInt4248 = -1;

	@OriginalMember(owner = "client!iga", name = "m", descriptor = "Lclient!tg;")
	private Class330 aClass330_22 = new Class330();

	@OriginalMember(owner = "client!iga", name = "n", descriptor = "Z")
	public boolean aBoolean310 = false;

	@OriginalMember(owner = "client!iga", name = "f", descriptor = "I")
	private final int anInt4245;

	@OriginalMember(owner = "client!iga", name = "k", descriptor = "I")
	private final int anInt4249;

	@OriginalMember(owner = "client!iga", name = "b", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!iga", name = "d", descriptor = "[Lclient!rda;")
	private Class5_Sub43[] aClass5_Sub43Array1;

	static {
		new Class98("", 73);
	}

	@OriginalMember(owner = "client!iga", name = "<init>", descriptor = "(III)V")
	public Class160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt4245 = arg1;
		this.anInt4249 = arg0;
		this.anIntArrayArrayArray3 = new int[this.anInt4249][3][arg2];
		this.aClass5_Sub43Array1 = new Class5_Sub43[this.anInt4245];
	}

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(BI)[[I")
	public int[][] method3854(@OriginalArg(1) int arg0) {
		if (this.anInt4249 == this.anInt4245) {
			this.aBoolean310 = this.aClass5_Sub43Array1[arg0] == null;
			this.aClass5_Sub43Array1[arg0] = Static604.aClass5_Sub43_6;
			return this.anIntArrayArrayArray3[arg0];
		} else if (this.anInt4249 == 1) {
			this.aBoolean310 = arg0 != this.anInt4248;
			this.anInt4248 = arg0;
			return this.anIntArrayArrayArray3[0];
		} else {
			@Pc(51) Class5_Sub43 local51 = this.aClass5_Sub43Array1[arg0];
			if (local51 == null) {
				this.aBoolean310 = true;
				if (this.anInt4249 <= this.anInt4243) {
					@Pc(72) Class5_Sub43 local72 = (Class5_Sub43) this.aClass330_22.method7913();
					local51 = new Class5_Sub43(arg0, local72.anInt8108);
					this.aClass5_Sub43Array1[local72.anInt8109] = null;
					local72.method9047();
				} else {
					local51 = new Class5_Sub43(arg0, this.anInt4243);
					this.anInt4243++;
				}
				this.aClass5_Sub43Array1[arg0] = local51;
			} else {
				this.aBoolean310 = false;
			}
			this.aClass330_22.method7919(local51);
			return this.anIntArrayArrayArray3[local51.anInt8108];
		}
	}

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(B)V")
	public void method3855() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt4249; local3++) {
			this.anIntArrayArrayArray3[local3][0] = null;
			this.anIntArrayArrayArray3[local3][1] = null;
			this.anIntArrayArrayArray3[local3][2] = null;
			this.anIntArrayArrayArray3[local3] = null;
		}
		this.anIntArrayArrayArray3 = null;
		this.aClass5_Sub43Array1 = null;
		this.aClass330_22.method7910();
		this.aClass330_22 = null;
	}

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(I)[[[I")
	public int[][][] method3858() {
		if (this.anInt4249 != this.anInt4245) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(17) int local17 = 0; local17 < this.anInt4249; local17++) {
			this.aClass5_Sub43Array1[local17] = Static604.aClass5_Sub43_6;
		}
		return this.anIntArrayArrayArray3;
	}
}
