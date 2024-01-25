import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public final class Class5_Sub45 extends Class5 {

	@OriginalMember(owner = "client!qc", name = "n", descriptor = "[I")
	private int[] anIntArray445;

	@OriginalMember(owner = "client!qc", name = "t", descriptor = "B")
	public byte aByte116;

	@OriginalMember(owner = "client!qc", name = "v", descriptor = "B")
	public byte aByte117;

	@OriginalMember(owner = "client!qc", name = "w", descriptor = "J")
	public long aLong219;

	@OriginalMember(owner = "client!qc", name = "z", descriptor = "[Lclient!fv;")
	public Class126[] aClass126Array1;

	@OriginalMember(owner = "client!qc", name = "J", descriptor = "Z")
	private boolean aBoolean680;

	@OriginalMember(owner = "client!qc", name = "y", descriptor = "I")
	public int anInt7909 = 0;

	@OriginalMember(owner = "client!qc", name = "G", descriptor = "Ljava/lang/String;")
	public String aString75 = null;

	@OriginalMember(owner = "client!qc", name = "I", descriptor = "Z")
	private boolean aBoolean679 = true;

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Lclient!mc;)V")
	public Class5_Sub45(@OriginalArg(0) Class5_Sub41 arg0) {
		this.method6685(arg0);
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(II)V")
	public void method6684(@OriginalArg(0) int arg0) {
		this.anInt7909--;
		if (this.anInt7909 == 0) {
			this.aClass126Array1 = null;
		} else {
			Static686.method4966(this.aClass126Array1, arg0 + 1, this.aClass126Array1, arg0, this.anInt7909 - arg0);
		}
		this.anIntArray445 = null;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!mc;I)V")
	private void method6685(@OriginalArg(0) Class5_Sub41 arg0) {
		@Pc(9) int local9 = arg0.method7816();
		if ((local9 & 0x1) != 0) {
			this.aBoolean680 = true;
		}
		if ((local9 & 0x2) != 0) {
			this.aBoolean679 = true;
		}
		super.aLong307 = arg0.method7823();
		this.aLong219 = arg0.method7823();
		this.aString75 = arg0.method7847();
		arg0.method7816();
		this.aByte117 = arg0.method7861();
		this.aByte116 = arg0.method7861();
		this.anInt7909 = arg0.method7860();
		if (this.anInt7909 <= 0) {
			return;
		}
		this.aClass126Array1 = new Class126[this.anInt7909];
		for (@Pc(79) int local79 = 0; local79 < this.anInt7909; local79++) {
			@Pc(85) Class126 local85 = new Class126();
			if (this.aBoolean680) {
				arg0.method7823();
			}
			if (this.aBoolean679) {
				local85.aString26 = arg0.method7847();
			}
			local85.aByte41 = arg0.method7861();
			local85.anInt3599 = arg0.method7860();
			this.aClass126Array1[local79] = local85;
		}
	}

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "(II)V")
	private void method6686(@OriginalArg(0) int arg0) {
		if (this.aClass126Array1 == null) {
			this.aClass126Array1 = new Class126[arg0];
		} else {
			Static686.method4966(this.aClass126Array1, 0, this.aClass126Array1 = new Class126[arg0], 0, this.anInt7909);
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)[I")
	public int[] method6687() {
		if (this.anIntArray445 == null) {
			@Pc(17) String[] local17 = new String[this.anInt7909];
			this.anIntArray445 = new int[this.anInt7909];
			@Pc(24) int local24 = 0;
			while (this.anInt7909 > local24) {
				local17[local24] = this.aClass126Array1[local24].aString26;
				this.anIntArray445[local24] = local24++;
			}
			Static41.method595(this.anIntArray445, local17);
		}
		return this.anIntArray445;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public int method6690(@OriginalArg(0) String arg0) {
		for (@Pc(5) int local5 = 0; local5 < this.anInt7909; local5++) {
			if (this.aClass126Array1[local5].aString26.equalsIgnoreCase(arg0)) {
				return local5;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!fv;I)V")
	public void method6691(@OriginalArg(0) Class126 arg0) {
		if (this.aClass126Array1 == null || this.aClass126Array1.length <= this.anInt7909) {
			this.method6686(this.anInt7909 + 5);
		}
		this.aClass126Array1[this.anInt7909++] = arg0;
		this.anIntArray445 = null;
	}
}
