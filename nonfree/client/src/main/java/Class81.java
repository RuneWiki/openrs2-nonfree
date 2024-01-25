import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ega")
public final class Class81 {

	@OriginalMember(owner = "client!ega", name = "c", descriptor = "I")
	public int anInt3149;

	@OriginalMember(owner = "client!ega", name = "d", descriptor = "I")
	public int anInt3150;

	@OriginalMember(owner = "client!ega", name = "f", descriptor = "I")
	public int anInt3151;

	@OriginalMember(owner = "client!ega", name = "h", descriptor = "I")
	public int anInt3153;

	@OriginalMember(owner = "client!ega", name = "i", descriptor = "I")
	private int anInt3154;

	@OriginalMember(owner = "client!ega", name = "j", descriptor = "I")
	public int anInt3155;

	@OriginalMember(owner = "client!ega", name = "k", descriptor = "I")
	public int anInt3156;

	@OriginalMember(owner = "client!ega", name = "m", descriptor = "I")
	public int anInt3158;

	@OriginalMember(owner = "client!ega", name = "o", descriptor = "J")
	public long aLong74;

	@OriginalMember(owner = "client!ega", name = "q", descriptor = "I")
	public int anInt3161;

	@OriginalMember(owner = "client!ega", name = "r", descriptor = "I")
	public int anInt3162;

	@OriginalMember(owner = "client!ega", name = "l", descriptor = "I")
	public int anInt3157 = 0;

	@OriginalMember(owner = "client!ega", name = "n", descriptor = "I")
	public int anInt3159 = 0;

	@OriginalMember(owner = "client!ega", name = "s", descriptor = "Z")
	private boolean aBoolean243 = false;

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(Lclient!ji;I)V")
	public void method2645(@OriginalArg(0) Class6_Sub8 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method8246();
			if (local5 == 0) {
				return;
			}
			this.method2649(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(I)V")
	public void method2648() {
		this.anInt3158 = Class78_Sub2_Sub2.anIntArray271[this.anInt3154 << 3];
		@Pc(17) long local17 = (long) this.anInt3150;
		@Pc(27) long local27 = (long) this.anInt3155;
		@Pc(31) long local31 = (long) this.anInt3149;
		this.anInt3161 = (int) Math.sqrt((double) (local17 * local17 + local27 * local27 + local31 * local31));
		if (this.anInt3156 == 0) {
			this.anInt3156 = 1;
		}
		if (this.anInt3162 == 0) {
			this.aLong74 = 2147483647L;
		} else if (this.anInt3162 == 1) {
			this.aLong74 = (long) (this.anInt3161 * 8 / this.anInt3156);
			this.aLong74 *= this.aLong74;
		} else if (this.anInt3162 == 2) {
			this.aLong74 = (long) (this.anInt3161 * 8 / this.anInt3156);
		}
		if (this.aBoolean243) {
			this.anInt3161 *= -1;
		}
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(ILclient!ji;B)V")
	private void method2649(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub8 arg1) {
		if (arg0 == 1) {
			this.anInt3154 = arg1.method8220();
		} else if (arg0 == 2) {
			arg1.method8246();
		} else if (arg0 == 3) {
			this.anInt3150 = arg1.method8236();
			this.anInt3155 = arg1.method8236();
			this.anInt3149 = arg1.method8236();
		} else if (arg0 == 4) {
			this.anInt3162 = arg1.method8246();
			this.anInt3156 = arg1.method8236();
		} else if (arg0 == 6) {
			this.anInt3151 = arg1.method8246();
		} else if (arg0 == 8) {
			this.anInt3157 = 1;
		} else if (arg0 == 9) {
			this.anInt3159 = 1;
		} else if (arg0 == 10) {
			this.aBoolean243 = true;
		}
	}
}
