import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wfa")
public final class Class372 {

	@OriginalMember(owner = "client!wfa", name = "h", descriptor = "I")
	private int anInt10332 = -1;

	@OriginalMember(owner = "client!wfa", name = "n", descriptor = "I")
	private int anInt10337 = 0;

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "Lclient!ada;")
	private Class8 aClass8_66 = new Class8();

	@OriginalMember(owner = "client!wfa", name = "o", descriptor = "Z")
	public boolean aBoolean691 = false;

	@OriginalMember(owner = "client!wfa", name = "j", descriptor = "I")
	private final int anInt10333;

	@OriginalMember(owner = "client!wfa", name = "l", descriptor = "I")
	private final int anInt10335;

	@OriginalMember(owner = "client!wfa", name = "i", descriptor = "[[I")
	private int[][] anIntArrayArray60;

	@OriginalMember(owner = "client!wfa", name = "f", descriptor = "[Lclient!dea;")
	private Class6_Sub11[] aClass6_Sub11Array1;

	@OriginalMember(owner = "client!wfa", name = "<init>", descriptor = "(III)V")
	public Class372(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt10333 = arg0;
		this.anInt10335 = arg1;
		this.anIntArrayArray60 = new int[this.anInt10333][arg2];
		this.aClass6_Sub11Array1 = new Class6_Sub11[this.anInt10335];
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(B)V")
	public void method8733() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt10333; local3++) {
			this.anIntArrayArray60[local3] = null;
		}
		this.anIntArrayArray60 = null;
		this.aClass6_Sub11Array1 = null;
		this.aClass8_66.method154();
		this.aClass8_66 = null;
	}

	@OriginalMember(owner = "client!wfa", name = "b", descriptor = "(B)[[I")
	public int[][] method8735() {
		if (this.anInt10335 != this.anInt10333) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(26) int local26 = 0; local26 < this.anInt10333; local26++) {
			this.aClass6_Sub11Array1[local26] = Static217.aClass6_Sub11_1;
		}
		return this.anIntArrayArray60;
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(IB)[I")
	public int[] method8736(@OriginalArg(0) int arg0) {
		if (this.anInt10333 == this.anInt10335) {
			this.aBoolean691 = this.aClass6_Sub11Array1[arg0] == null;
			this.aClass6_Sub11Array1[arg0] = Static217.aClass6_Sub11_1;
			return this.anIntArrayArray60[arg0];
		} else if (this.anInt10333 == 1) {
			this.aBoolean691 = this.anInt10332 != arg0;
			this.anInt10332 = arg0;
			return this.anIntArrayArray60[0];
		} else {
			@Pc(72) Class6_Sub11 local72 = this.aClass6_Sub11Array1[arg0];
			if (local72 == null) {
				this.aBoolean691 = true;
				if (this.anInt10337 >= this.anInt10333) {
					@Pc(88) Class6_Sub11 local88 = (Class6_Sub11) this.aClass8_66.method159();
					local72 = new Class6_Sub11(arg0, local88.anInt1919);
					this.aClass6_Sub11Array1[local88.anInt1918] = null;
					local88.method9043();
				} else {
					local72 = new Class6_Sub11(arg0, this.anInt10337);
					this.anInt10337++;
				}
				this.aClass6_Sub11Array1[arg0] = local72;
			} else {
				this.aBoolean691 = false;
			}
			this.aClass8_66.method146(local72);
			return this.anIntArrayArray60[local72.anInt1919];
		}
	}
}
