import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nr")
public final class Class246 {

	@OriginalMember(owner = "client!nr", name = "j", descriptor = "I")
	private int anInt6756 = 0;

	@OriginalMember(owner = "client!nr", name = "h", descriptor = "I")
	private int anInt6754 = -1;

	@OriginalMember(owner = "client!nr", name = "g", descriptor = "Lclient!ro;")
	private Class306 aClass306_32 = new Class306();

	@OriginalMember(owner = "client!nr", name = "o", descriptor = "Z")
	public boolean aBoolean561 = false;

	@OriginalMember(owner = "client!nr", name = "d", descriptor = "I")
	private final int anInt6752;

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "I")
	private final int anInt6750;

	@OriginalMember(owner = "client!nr", name = "f", descriptor = "[Lclient!mt;")
	private Class5_Sub34[] aClass5_Sub34Array1;

	@OriginalMember(owner = "client!nr", name = "l", descriptor = "[[I")
	private int[][] anIntArrayArray36;

	@OriginalMember(owner = "client!nr", name = "<init>", descriptor = "(III)V")
	public Class246(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt6752 = arg0;
		this.anInt6750 = arg1;
		this.aClass5_Sub34Array1 = new Class5_Sub34[this.anInt6750];
		this.anIntArrayArray36 = new int[this.anInt6752][arg2];
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(IZ)[I")
	public int[] method5949(@OriginalArg(0) int arg0) {
		if (this.anInt6750 == this.anInt6752) {
			this.aBoolean561 = this.aClass5_Sub34Array1[arg0] == null;
			this.aClass5_Sub34Array1[arg0] = Static347.aClass5_Sub34_2;
			return this.anIntArrayArray36[arg0];
		} else if (this.anInt6752 == 1) {
			this.aBoolean561 = this.anInt6754 != arg0;
			this.anInt6754 = arg0;
			return this.anIntArrayArray36[0];
		} else {
			@Pc(47) Class5_Sub34 local47 = this.aClass5_Sub34Array1[arg0];
			if (local47 == null) {
				this.aBoolean561 = true;
				if (this.anInt6752 <= this.anInt6756) {
					@Pc(72) Class5_Sub34 local72 = (Class5_Sub34) this.aClass306_32.method7304();
					local47 = new Class5_Sub34(arg0, local72.anInt6391);
					this.aClass5_Sub34Array1[local72.anInt6389] = null;
					local72.method8911();
				} else {
					local47 = new Class5_Sub34(arg0, this.anInt6756);
					this.anInt6756++;
				}
				this.aClass5_Sub34Array1[arg0] = local47;
			} else {
				this.aBoolean561 = false;
			}
			this.aClass306_32.method7305(local47);
			return this.anIntArrayArray36[local47.anInt6391];
		}
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(B)[[I")
	public int[][] method5950() {
		if (this.anInt6752 != this.anInt6750) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(29) int local29 = 0; local29 < this.anInt6752; local29++) {
			this.aClass5_Sub34Array1[local29] = Static347.aClass5_Sub34_2;
		}
		return this.anIntArrayArray36;
	}

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "(B)V")
	public void method5951() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt6752; local3++) {
			this.anIntArrayArray36[local3] = null;
		}
		this.aClass5_Sub34Array1 = null;
		this.anIntArrayArray36 = null;
		this.aClass306_32.method7315();
		this.aClass306_32 = null;
	}
}
