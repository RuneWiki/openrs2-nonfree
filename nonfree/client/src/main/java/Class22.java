import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!av")
public final class Class22 {

	@OriginalMember(owner = "client!av", name = "i", descriptor = "I")
	private int anInt294 = 0;

	@OriginalMember(owner = "client!av", name = "l", descriptor = "I")
	private int anInt297 = -1;

	@OriginalMember(owner = "client!av", name = "q", descriptor = "Lclient!am;")
	private Class14 aClass14_2 = new Class14();

	@OriginalMember(owner = "client!av", name = "s", descriptor = "Z")
	public boolean aBoolean44 = false;

	@OriginalMember(owner = "client!av", name = "m", descriptor = "I")
	private final int anInt298;

	@OriginalMember(owner = "client!av", name = "c", descriptor = "I")
	private final int anInt291;

	@OriginalMember(owner = "client!av", name = "e", descriptor = "[Lclient!lt;")
	private Class1_Sub30[] aClass1_Sub30Array1;

	@OriginalMember(owner = "client!av", name = "g", descriptor = "[[I")
	private int[][] anIntArrayArray8;

	@OriginalMember(owner = "client!av", name = "<init>", descriptor = "(III)V")
	public Class22(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt298 = arg0;
		this.anInt291 = arg1;
		this.aClass1_Sub30Array1 = new Class1_Sub30[this.anInt291];
		this.anIntArrayArray8 = new int[this.anInt298][arg2];
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(I)V")
	public void method307() {
		for (@Pc(11) int local11 = 0; local11 < this.anInt298; local11++) {
			this.anIntArrayArray8[local11] = null;
		}
		this.anIntArrayArray8 = null;
		this.aClass1_Sub30Array1 = null;
		this.aClass14_2.method204();
		this.aClass14_2 = null;
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(II)[I")
	public int[] method312(@OriginalArg(1) int arg0) {
		if (this.anInt298 == this.anInt291) {
			this.aBoolean44 = this.aClass1_Sub30Array1[arg0] == null;
			this.aClass1_Sub30Array1[arg0] = Static47.aClass1_Sub30_1;
			return this.anIntArrayArray8[arg0];
		} else if (this.anInt298 == 1) {
			this.aBoolean44 = this.anInt297 != arg0;
			this.anInt297 = arg0;
			return this.anIntArrayArray8[0];
		} else {
			@Pc(65) Class1_Sub30 local65 = this.aClass1_Sub30Array1[arg0];
			if (local65 == null) {
				this.aBoolean44 = true;
				if (this.anInt298 <= this.anInt294) {
					@Pc(86) Class1_Sub30 local86 = (Class1_Sub30) this.aClass14_2.method210();
					local65 = new Class1_Sub30(arg0, local86.anInt4398);
					this.aClass1_Sub30Array1[local86.anInt4396] = null;
					local86.method5953();
				} else {
					local65 = new Class1_Sub30(arg0, this.anInt294);
					this.anInt294++;
				}
				this.aClass1_Sub30Array1[arg0] = local65;
			} else {
				this.aBoolean44 = false;
			}
			this.aClass14_2.method206(local65);
			return this.anIntArrayArray8[local65.anInt4398];
		}
	}

	@OriginalMember(owner = "client!av", name = "b", descriptor = "(B)[[I")
	public int[][] method314() {
		if (this.anInt298 != this.anInt291) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(24) int local24 = 0; local24 < this.anInt298; local24++) {
			this.aClass1_Sub30Array1[local24] = Static47.aClass1_Sub30_1;
		}
		return this.anIntArrayArray8;
	}
}
