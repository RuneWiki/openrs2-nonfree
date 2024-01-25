import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dv")
public final class Class89 {

	@OriginalMember(owner = "client!dv", name = "m", descriptor = "Lclient!tha;")
	public Class4_Sub3_Sub1 aClass4_Sub3_Sub1_1;

	@OriginalMember(owner = "client!dv", name = "l", descriptor = "Lclient!saa;")
	public Class4_Sub3_Sub5 aClass4_Sub3_Sub5_1;

	@OriginalMember(owner = "client!dv", name = "o", descriptor = "S")
	public short aShort6;

	@OriginalMember(owner = "client!dv", name = "g", descriptor = "S")
	public short aShort7;

	@OriginalMember(owner = "client!dv", name = "v", descriptor = "Lclient!cea;")
	public Class58 aClass58_2;

	@OriginalMember(owner = "client!dv", name = "s", descriptor = "S")
	public short aShort8;

	@OriginalMember(owner = "client!dv", name = "c", descriptor = "S")
	public short aShort9;

	@OriginalMember(owner = "client!dv", name = "r", descriptor = "Lclient!saa;")
	public Class4_Sub3_Sub5 aClass4_Sub3_Sub5_2;

	@OriginalMember(owner = "client!dv", name = "w", descriptor = "Lclient!ef;")
	public Class4_Sub3_Sub2 aClass4_Sub3_Sub2_1;

	@OriginalMember(owner = "client!dv", name = "n", descriptor = "Lclient!tha;")
	public Class4_Sub3_Sub1 aClass4_Sub3_Sub1_2;

	@OriginalMember(owner = "client!dv", name = "t", descriptor = "Lclient!dv;")
	public Class89 aClass89_1;

	@OriginalMember(owner = "client!dv", name = "h", descriptor = "Lclient!in;")
	public Class4_Sub3_Sub4 aClass4_Sub3_Sub4_1;

	@OriginalMember(owner = "client!dv", name = "f", descriptor = "B")
	public byte aByte27;

	@OriginalMember(owner = "client!dv", name = "<init>", descriptor = "(I)V")
	public Class89(@OriginalArg(0) int arg0) {
		this.aByte27 = (byte) arg0;
	}

	@OriginalMember(owner = "client!dv", name = "b", descriptor = "(B)V")
	public void method1856() {
		while (this.aClass58_2 != null) {
			@Pc(4) Class58 local4 = this.aClass58_2.aClass58_1;
			this.aClass58_2.method1088();
			this.aClass58_2 = local4;
		}
	}
}
