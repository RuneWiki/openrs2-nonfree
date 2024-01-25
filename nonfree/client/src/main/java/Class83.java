import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dn")
public final class Class83 {

	@OriginalMember(owner = "client!dn", name = "j", descriptor = "I")
	private int anInt1887 = 0;

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "I")
	private int anInt1883 = -1;

	@OriginalMember(owner = "client!dn", name = "f", descriptor = "Lclient!bd;")
	private Class32 aClass32_10 = new Class32();

	@OriginalMember(owner = "client!dn", name = "c", descriptor = "Z")
	public boolean aBoolean135 = false;

	@OriginalMember(owner = "client!dn", name = "h", descriptor = "I")
	private final int anInt1889;

	@OriginalMember(owner = "client!dn", name = "e", descriptor = "I")
	private final int anInt1884;

	@OriginalMember(owner = "client!dn", name = "m", descriptor = "[Lclient!qfa;")
	private Class14_Sub38[] aClass14_Sub38Array1;

	@OriginalMember(owner = "client!dn", name = "i", descriptor = "[[I")
	private int[][] anIntArrayArray13;

	@OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(III)V")
	public Class83(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt1889 = arg1;
		this.anInt1884 = arg0;
		this.aClass14_Sub38Array1 = new Class14_Sub38[this.anInt1889];
		this.anIntArrayArray13 = new int[this.anInt1884][arg2];
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IB)[I")
	public int[] method1817(@OriginalArg(0) int arg0) {
		if (this.anInt1884 == this.anInt1889) {
			this.aBoolean135 = this.aClass14_Sub38Array1[arg0] == null;
			this.aClass14_Sub38Array1[arg0] = Static653.aClass14_Sub38_1;
			return this.anIntArrayArray13[arg0];
		} else if (this.anInt1884 == 1) {
			this.aBoolean135 = this.anInt1883 != arg0;
			this.anInt1883 = arg0;
			return this.anIntArrayArray13[0];
		} else {
			@Pc(53) Class14_Sub38 local53 = this.aClass14_Sub38Array1[arg0];
			if (local53 == null) {
				this.aBoolean135 = true;
				if (this.anInt1887 >= this.anInt1884) {
					@Pc(78) Class14_Sub38 local78 = (Class14_Sub38) this.aClass32_10.method578();
					local53 = new Class14_Sub38(arg0, local78.anInt8488);
					this.aClass14_Sub38Array1[local78.anInt8490] = null;
					local78.method9513();
				} else {
					local53 = new Class14_Sub38(arg0, this.anInt1887);
					this.anInt1887++;
				}
				this.aClass14_Sub38Array1[arg0] = local53;
			} else {
				this.aBoolean135 = false;
			}
			this.aClass32_10.method585(local53);
			return this.anIntArrayArray13[local53.anInt8488];
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(B)[[I")
	public int[][] method1818() {
		if (this.anInt1884 != this.anInt1889) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(30) int local30 = 0; local30 < this.anInt1884; local30++) {
			this.aClass14_Sub38Array1[local30] = Static653.aClass14_Sub38_1;
		}
		return this.anIntArrayArray13;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(I)V")
	public void method1819() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt1884; local7++) {
			this.anIntArrayArray13[local7] = null;
		}
		this.anIntArrayArray13 = null;
		this.aClass14_Sub38Array1 = null;
		this.aClass32_10.method588();
		this.aClass32_10 = null;
	}
}
