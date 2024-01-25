import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pe")
public final class Class227 {

	@OriginalMember(owner = "client!pe", name = "g", descriptor = "I")
	private int anInt6545 = 0;

	@OriginalMember(owner = "client!pe", name = "i", descriptor = "I")
	private int anInt6546 = -1;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "Lclient!bu;")
	private Class38 aClass38_50 = new Class38();

	@OriginalMember(owner = "client!pe", name = "o", descriptor = "Z")
	public boolean aBoolean433 = false;

	@OriginalMember(owner = "client!pe", name = "n", descriptor = "I")
	private final int anInt6551;

	@OriginalMember(owner = "client!pe", name = "l", descriptor = "I")
	private final int anInt6549;

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "[Lclient!id;")
	private Class1_Sub23[] aClass1_Sub23Array1;

	@OriginalMember(owner = "client!pe", name = "h", descriptor = "[[I")
	private int[][] anIntArrayArray54;

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(III)V")
	public Class227(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt6551 = arg1;
		this.anInt6549 = arg0;
		this.aClass1_Sub23Array1 = new Class1_Sub23[this.anInt6551];
		this.anIntArrayArray54 = new int[this.anInt6549][arg2];
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)[I")
	public int[] method5672(@OriginalArg(0) int arg0) {
		if (this.anInt6551 == this.anInt6549) {
			this.aBoolean433 = this.aClass1_Sub23Array1[arg0] == null;
			this.aClass1_Sub23Array1[arg0] = Static270.aClass1_Sub23_1;
			return this.anIntArrayArray54[arg0];
		} else if (this.anInt6549 == 1) {
			this.aBoolean433 = arg0 != this.anInt6546;
			this.anInt6546 = arg0;
			return this.anIntArrayArray54[0];
		} else {
			@Pc(51) Class1_Sub23 local51 = this.aClass1_Sub23Array1[arg0];
			if (local51 == null) {
				this.aBoolean433 = true;
				if (this.anInt6545 >= this.anInt6549) {
					@Pc(73) Class1_Sub23 local73 = (Class1_Sub23) this.aClass38_50.method1420();
					local51 = new Class1_Sub23(arg0, local73.anInt4239);
					this.aClass1_Sub23Array1[local73.anInt4240] = null;
					local73.method7983();
				} else {
					local51 = new Class1_Sub23(arg0, this.anInt6545);
					this.anInt6545++;
				}
				this.aClass1_Sub23Array1[arg0] = local51;
			} else {
				this.aBoolean433 = false;
			}
			this.aClass38_50.method1418(local51);
			return this.anIntArrayArray54[local51.anInt4239];
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Z)[[I")
	public int[][] method5675() {
		if (this.anInt6549 != this.anInt6551) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(23) int local23 = 0; local23 < this.anInt6549; local23++) {
			this.aClass1_Sub23Array1[local23] = Static270.aClass1_Sub23_1;
		}
		return this.anIntArrayArray54;
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(Z)V")
	public void method5676() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt6549; local7++) {
			this.anIntArrayArray54[local7] = null;
		}
		this.anIntArrayArray54 = null;
		this.aClass1_Sub23Array1 = null;
		this.aClass38_50.method1417();
		this.aClass38_50 = null;
	}
}
