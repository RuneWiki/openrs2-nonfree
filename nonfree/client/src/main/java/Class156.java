import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ms")
public final class Class156 {

	@OriginalMember(owner = "client!ms", name = "c", descriptor = "I")
	private int anInt4426 = -1;

	@OriginalMember(owner = "client!ms", name = "o", descriptor = "I")
	private int anInt4433 = 0;

	@OriginalMember(owner = "client!ms", name = "k", descriptor = "Lclient!vf;")
	private Class238 aClass238_20 = new Class238();

	@OriginalMember(owner = "client!ms", name = "q", descriptor = "Z")
	public boolean aBoolean318 = false;

	@OriginalMember(owner = "client!ms", name = "n", descriptor = "I")
	private final int anInt4432;

	@OriginalMember(owner = "client!ms", name = "b", descriptor = "I")
	private final int anInt4425;

	@OriginalMember(owner = "client!ms", name = "h", descriptor = "[[I")
	private int[][] anIntArrayArray23;

	@OriginalMember(owner = "client!ms", name = "e", descriptor = "[Lclient!tl;")
	private Class2_Sub37[] aClass2_Sub37Array1;

	@OriginalMember(owner = "client!ms", name = "<init>", descriptor = "(III)V")
	public Class156(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt4432 = arg0;
		this.anInt4425 = arg1;
		this.anIntArrayArray23 = new int[this.anInt4432][arg2];
		this.aClass2_Sub37Array1 = new Class2_Sub37[this.anInt4425];
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(I)[[I")
	public int[][] method3898() {
		if (this.anInt4432 != this.anInt4425) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(21) int local21 = 0; local21 < this.anInt4432; local21++) {
			this.aClass2_Sub37Array1[local21] = Static247.aClass2_Sub37_1;
		}
		return this.anIntArrayArray23;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(II)[I")
	public int[] method3899(@OriginalArg(0) int arg0) {
		if (this.anInt4432 == this.anInt4425) {
			this.aBoolean318 = this.aClass2_Sub37Array1[arg0] == null;
			this.aClass2_Sub37Array1[arg0] = Static247.aClass2_Sub37_1;
			return this.anIntArrayArray23[arg0];
		} else if (this.anInt4432 == 1) {
			this.aBoolean318 = this.anInt4426 != arg0;
			this.anInt4426 = arg0;
			return this.anIntArrayArray23[0];
		} else {
			@Pc(69) Class2_Sub37 local69 = this.aClass2_Sub37Array1[arg0];
			if (local69 == null) {
				this.aBoolean318 = true;
				if (this.anInt4432 <= this.anInt4433) {
					@Pc(87) Class2_Sub37 local87 = (Class2_Sub37) this.aClass238_20.method5800();
					local69 = new Class2_Sub37(arg0, local87.anInt6260);
					this.aClass2_Sub37Array1[local87.anInt6261] = null;
					local87.method6130();
				} else {
					local69 = new Class2_Sub37(arg0, this.anInt4433);
					this.anInt4433++;
				}
				this.aClass2_Sub37Array1[arg0] = local69;
			} else {
				this.aBoolean318 = false;
			}
			this.aClass238_20.method5804(local69);
			return this.anIntArrayArray23[local69.anInt6260];
		}
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(B)V")
	public void method3901() {
		for (@Pc(8) int local8 = 0; local8 < this.anInt4432; local8++) {
			this.anIntArrayArray23[local8] = null;
		}
		this.anIntArrayArray23 = null;
		this.aClass2_Sub37Array1 = null;
		this.aClass238_20.method5806();
		this.aClass238_20 = null;
	}
}
