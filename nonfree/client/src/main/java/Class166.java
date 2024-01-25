import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ob")
public final class Class166 {

	@OriginalMember(owner = "client!ob", name = "h", descriptor = "I")
	private int anInt4499 = 0;

	@OriginalMember(owner = "client!ob", name = "n", descriptor = "I")
	private int anInt4504 = -1;

	@OriginalMember(owner = "client!ob", name = "g", descriptor = "Lclient!sm;")
	private Class210 aClass210_32 = new Class210();

	@OriginalMember(owner = "client!ob", name = "p", descriptor = "Z")
	public boolean aBoolean336 = false;

	@OriginalMember(owner = "client!ob", name = "m", descriptor = "I")
	private final int anInt4503;

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "I")
	private final int anInt4497;

	@OriginalMember(owner = "client!ob", name = "o", descriptor = "[[I")
	private int[][] anIntArrayArray34;

	@OriginalMember(owner = "client!ob", name = "j", descriptor = "[Lclient!nm;")
	private Class2_Sub26[] aClass2_Sub26Array1;

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(III)V")
	public Class166(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt4503 = arg0;
		this.anInt4497 = arg1;
		this.anIntArrayArray34 = new int[this.anInt4503][arg2];
		this.aClass2_Sub26Array1 = new Class2_Sub26[this.anInt4497];
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Z)[[I")
	public int[][] method3990() {
		if (this.anInt4503 != this.anInt4497) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(26) int local26 = 0; local26 < this.anInt4503; local26++) {
			this.aClass2_Sub26Array1[local26] = Static383.aClass2_Sub26_1;
		}
		return this.anIntArrayArray34;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V")
	public void method3992() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt4503; local7++) {
			this.anIntArrayArray34[local7] = null;
		}
		this.aClass2_Sub26Array1 = null;
		this.anIntArrayArray34 = null;
		this.aClass210_32.method5043();
		this.aClass210_32 = null;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(II)[I")
	public int[] method3993(@OriginalArg(0) int arg0) {
		if (this.anInt4503 == this.anInt4497) {
			this.aBoolean336 = this.aClass2_Sub26Array1[arg0] == null;
			this.aClass2_Sub26Array1[arg0] = Static383.aClass2_Sub26_1;
			return this.anIntArrayArray34[arg0];
		} else if (this.anInt4503 == 1) {
			this.aBoolean336 = this.anInt4504 != arg0;
			this.anInt4504 = arg0;
			return this.anIntArrayArray34[0];
		} else {
			@Pc(65) Class2_Sub26 local65 = this.aClass2_Sub26Array1[arg0];
			if (local65 == null) {
				this.aBoolean336 = true;
				if (this.anInt4503 > this.anInt4499) {
					local65 = new Class2_Sub26(arg0, this.anInt4499);
					this.anInt4499++;
				} else {
					@Pc(100) Class2_Sub26 local100 = (Class2_Sub26) this.aClass210_32.method5036();
					local65 = new Class2_Sub26(arg0, local100.anInt4375);
					this.aClass2_Sub26Array1[local100.anInt4378] = null;
					local100.method5745();
				}
				this.aClass2_Sub26Array1[arg0] = local65;
			} else {
				this.aBoolean336 = false;
			}
			this.aClass210_32.method5032(local65);
			return this.anIntArrayArray34[local65.anInt4375];
		}
	}
}
