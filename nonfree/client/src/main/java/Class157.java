import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!of")
public final class Class157 {

	@OriginalMember(owner = "client!of", name = "f", descriptor = "I")
	private int anInt4485 = -1;

	@OriginalMember(owner = "client!of", name = "l", descriptor = "I")
	private int anInt4490 = 0;

	@OriginalMember(owner = "client!of", name = "b", descriptor = "Lclient!bd;")
	private Class18 aClass18_25 = new Class18();

	@OriginalMember(owner = "client!of", name = "n", descriptor = "Z")
	public boolean aBoolean296 = false;

	@OriginalMember(owner = "client!of", name = "g", descriptor = "I")
	private final int anInt4486;

	@OriginalMember(owner = "client!of", name = "a", descriptor = "I")
	private final int anInt4483;

	@OriginalMember(owner = "client!of", name = "d", descriptor = "[Lclient!pq;")
	private Class14_Sub25[] aClass14_Sub25Array1;

	@OriginalMember(owner = "client!of", name = "c", descriptor = "[[I")
	private int[][] anIntArrayArray75;

	@OriginalMember(owner = "client!of", name = "<init>", descriptor = "(III)V")
	public Class157(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt4486 = arg1;
		this.anInt4483 = arg0;
		this.aClass14_Sub25Array1 = new Class14_Sub25[this.anInt4486];
		this.anIntArrayArray75 = new int[this.anInt4483][arg2];
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(I)[[I")
	public int[][] method4023() {
		if (this.anInt4486 != this.anInt4483) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(24) int local24 = 0; local24 < this.anInt4483; local24++) {
			this.aClass14_Sub25Array1[local24] = Static272.aClass14_Sub25_1;
		}
		return this.anIntArrayArray75;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(BI)[I")
	public int[] method4026(@OriginalArg(1) int arg0) {
		if (this.anInt4483 == this.anInt4486) {
			this.aBoolean296 = this.aClass14_Sub25Array1[arg0] == null;
			this.aClass14_Sub25Array1[arg0] = Static272.aClass14_Sub25_1;
			return this.anIntArrayArray75[arg0];
		} else if (this.anInt4483 == 1) {
			this.aBoolean296 = this.anInt4485 != arg0;
			this.anInt4485 = arg0;
			return this.anIntArrayArray75[0];
		} else {
			@Pc(52) Class14_Sub25 local52 = this.aClass14_Sub25Array1[arg0];
			if (local52 == null) {
				this.aBoolean296 = true;
				if (this.anInt4490 >= this.anInt4483) {
					@Pc(72) Class14_Sub25 local72 = (Class14_Sub25) this.aClass18_25.method463();
					local52 = new Class14_Sub25(arg0, local72.anInt4867);
					this.aClass14_Sub25Array1[local72.anInt4869] = null;
					local72.method5986();
				} else {
					local52 = new Class14_Sub25(arg0, this.anInt4490);
					this.anInt4490++;
				}
				this.aClass14_Sub25Array1[arg0] = local52;
			} else {
				this.aBoolean296 = false;
			}
			this.aClass18_25.method456(local52);
			return this.anIntArrayArray75[local52.anInt4867];
		}
	}

	@OriginalMember(owner = "client!of", name = "c", descriptor = "(I)V")
	public void method4027() {
		for (@Pc(15) int local15 = 0; local15 < this.anInt4483; local15++) {
			this.anIntArrayArray75[local15] = null;
		}
		this.aClass14_Sub25Array1 = null;
		this.anIntArrayArray75 = null;
		this.aClass18_25.method461();
		this.aClass18_25 = null;
	}
}
