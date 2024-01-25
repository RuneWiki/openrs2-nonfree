import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mf")
public final class Class234 {

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "I")
	private int anInt5863 = 0;

	@OriginalMember(owner = "client!mf", name = "o", descriptor = "I")
	private int anInt5862 = -1;

	@OriginalMember(owner = "client!mf", name = "n", descriptor = "Lclient!at;")
	private Class20 aClass20_29 = new Class20();

	@OriginalMember(owner = "client!mf", name = "j", descriptor = "Z")
	public boolean aBoolean392 = false;

	@OriginalMember(owner = "client!mf", name = "h", descriptor = "I")
	private final int anInt5865;

	@OriginalMember(owner = "client!mf", name = "g", descriptor = "I")
	private final int anInt5864;

	@OriginalMember(owner = "client!mf", name = "e", descriptor = "[[I")
	private int[][] anIntArrayArray41;

	@OriginalMember(owner = "client!mf", name = "l", descriptor = "[Lclient!bm;")
	private Class5_Sub7[] aClass5_Sub7Array1;

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(III)V")
	public Class234(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt5865 = arg0;
		this.anInt5864 = arg1;
		this.anIntArrayArray41 = new int[this.anInt5865][arg2];
		this.aClass5_Sub7Array1 = new Class5_Sub7[this.anInt5864];
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)V")
	public void method5228() {
		for (@Pc(8) int local8 = 0; local8 < this.anInt5865; local8++) {
			this.anIntArrayArray41[local8] = null;
		}
		this.anIntArrayArray41 = null;
		this.aClass5_Sub7Array1 = null;
		this.aClass20_29.method374();
		this.aClass20_29 = null;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)[[I")
	public int[][] method5230() {
		if (this.anInt5864 != this.anInt5865) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(24) int local24 = 0; local24 < this.anInt5865; local24++) {
			this.aClass5_Sub7Array1[local24] = Static473.aClass5_Sub7_1;
		}
		return this.anIntArrayArray41;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IB)[I")
	public int[] method5232(@OriginalArg(0) int arg0) {
		if (this.anInt5865 == this.anInt5864) {
			this.aBoolean392 = this.aClass5_Sub7Array1[arg0] == null;
			this.aClass5_Sub7Array1[arg0] = Static473.aClass5_Sub7_1;
			return this.anIntArrayArray41[arg0];
		} else if (this.anInt5865 == 1) {
			this.aBoolean392 = arg0 != this.anInt5862;
			this.anInt5862 = arg0;
			return this.anIntArrayArray41[0];
		} else {
			@Pc(53) Class5_Sub7 local53 = this.aClass5_Sub7Array1[arg0];
			if (local53 == null) {
				this.aBoolean392 = true;
				if (this.anInt5865 <= this.anInt5863) {
					@Pc(82) Class5_Sub7 local82 = (Class5_Sub7) this.aClass20_29.method379();
					local53 = new Class5_Sub7(arg0, local82.anInt718);
					this.aClass5_Sub7Array1[local82.anInt719] = null;
					local82.method9222();
				} else {
					local53 = new Class5_Sub7(arg0, this.anInt5863);
					this.anInt5863++;
				}
				this.aClass5_Sub7Array1[arg0] = local53;
			} else {
				this.aBoolean392 = false;
			}
			this.aClass20_29.method371(local53);
			return this.anIntArrayArray41[local53.anInt718];
		}
	}
}
