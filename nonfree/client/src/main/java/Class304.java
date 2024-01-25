import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sda")
public final class Class304 {

	@OriginalMember(owner = "client!sda", name = "h", descriptor = "I")
	private int anInt8582 = -1;

	@OriginalMember(owner = "client!sda", name = "j", descriptor = "I")
	private int anInt8584 = 0;

	@OriginalMember(owner = "client!sda", name = "f", descriptor = "Lclient!nt;")
	private Class238 aClass238_58 = new Class238();

	@OriginalMember(owner = "client!sda", name = "m", descriptor = "Z")
	public boolean aBoolean638 = false;

	@OriginalMember(owner = "client!sda", name = "b", descriptor = "I")
	private final int anInt8578;

	@OriginalMember(owner = "client!sda", name = "i", descriptor = "I")
	private final int anInt8583;

	@OriginalMember(owner = "client!sda", name = "d", descriptor = "[Lclient!tw;")
	private Class2_Sub49[] aClass2_Sub49Array1;

	@OriginalMember(owner = "client!sda", name = "l", descriptor = "[[I")
	private int[][] anIntArrayArray77;

	@OriginalMember(owner = "client!sda", name = "<init>", descriptor = "(III)V")
	public Class304(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt8578 = arg0;
		this.anInt8583 = arg1;
		this.aClass2_Sub49Array1 = new Class2_Sub49[this.anInt8583];
		this.anIntArrayArray77 = new int[this.anInt8578][arg2];
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(I)V")
	public void method7207() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt8578; local7++) {
			this.anIntArrayArray77[local7] = null;
		}
		this.anIntArrayArray77 = null;
		this.aClass2_Sub49Array1 = null;
		this.aClass238_58.method5841();
		this.aClass238_58 = null;
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(II)[I")
	public int[] method7208(@OriginalArg(0) int arg0) {
		if (this.anInt8578 == this.anInt8583) {
			this.aBoolean638 = this.aClass2_Sub49Array1[arg0] == null;
			this.aClass2_Sub49Array1[arg0] = Static417.aClass2_Sub49_1;
			return this.anIntArrayArray77[arg0];
		} else if (this.anInt8578 == 1) {
			this.aBoolean638 = this.anInt8582 != arg0;
			this.anInt8582 = arg0;
			return this.anIntArrayArray77[0];
		} else {
			@Pc(62) Class2_Sub49 local62 = this.aClass2_Sub49Array1[arg0];
			if (local62 == null) {
				this.aBoolean638 = true;
				if (this.anInt8578 <= this.anInt8584) {
					@Pc(82) Class2_Sub49 local82 = (Class2_Sub49) this.aClass238_58.method5834();
					local62 = new Class2_Sub49(arg0, local82.anInt9263);
					this.aClass2_Sub49Array1[local82.anInt9262] = null;
					local82.method8599();
				} else {
					local62 = new Class2_Sub49(arg0, this.anInt8584);
					this.anInt8584++;
				}
				this.aClass2_Sub49Array1[arg0] = local62;
			} else {
				this.aBoolean638 = false;
			}
			this.aClass238_58.method5835(local62);
			return this.anIntArrayArray77[local62.anInt9263];
		}
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(B)[[I")
	public int[][] method7210() {
		if (this.anInt8578 != this.anInt8583) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(17) int local17 = 0; local17 < this.anInt8578; local17++) {
			this.aClass2_Sub49Array1[local17] = Static417.aClass2_Sub49_1;
		}
		return this.anIntArrayArray77;
	}
}
