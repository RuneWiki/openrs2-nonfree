import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public class Class12_Sub1 extends Class12 {

	@OriginalMember(owner = "client!bs", name = "q", descriptor = "Lclient!gd;")
	public static final Class79 aClass79_96 = new Class79("level: ", "Stufe: ", "niveau ", "nível: ");

	@OriginalMember(owner = "client!bs", name = "s", descriptor = "Lclient!h;")
	public static final Class89 aClass89_171 = new Class89(74, 4);

	@OriginalMember(owner = "client!bs", name = "t", descriptor = "I")
	public static int anInt4455 = -1;

	@OriginalMember(owner = "client!bs", name = "m", descriptor = "Lclient!bs;")
	public Class12_Sub1 aClass12_Sub1_5;

	@OriginalMember(owner = "client!bs", name = "r", descriptor = "Lclient!bs;")
	public Class12_Sub1 aClass12_Sub1_6;

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "(B)V", line = 216)
	public final void method4207() {
		if (this.aClass12_Sub1_6 != null) {
			this.aClass12_Sub1_6.aClass12_Sub1_5 = this.aClass12_Sub1_5;
			this.aClass12_Sub1_5.aClass12_Sub1_6 = this.aClass12_Sub1_6;
			this.aClass12_Sub1_5 = null;
			this.aClass12_Sub1_6 = null;
		}
	}
}
