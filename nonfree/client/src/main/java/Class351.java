import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public final class Class351 {

	@OriginalMember(owner = "client!ui", name = "g", descriptor = "Lclient!iha;")
	public Class5_Sub17_Sub2 aClass5_Sub17_Sub2_4;

	@OriginalMember(owner = "client!ui", name = "k", descriptor = "Lclient!nga;")
	public Class5_Sub42_Sub1 aClass5_Sub42_Sub1_4;

	@OriginalMember(owner = "client!ui", name = "l", descriptor = "Lclient!pc;")
	public Class272 aClass272_1;

	@OriginalMember(owner = "client!ui", name = "n", descriptor = "Lclient!lea;")
	public Class5_Sub38 aClass5_Sub38_3;

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "I")
	public final int anInt9877;

	@OriginalMember(owner = "client!ui", name = "e", descriptor = "I")
	public int anInt9878;

	@OriginalMember(owner = "client!ui", name = "o", descriptor = "I")
	public final int anInt9882;

	@OriginalMember(owner = "client!ui", name = "h", descriptor = "I")
	public final int anInt9880;

	@OriginalMember(owner = "client!ui", name = "d", descriptor = "B")
	public final byte aByte134;

	@OriginalMember(owner = "client!ui", name = "j", descriptor = "I")
	public final int anInt9881;

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "I")
	public final int anInt9876;

	@OriginalMember(owner = "client!ui", name = "i", descriptor = "Lclient!lq;")
	public final Class28_Sub1 aClass28_Sub1_20;

	@OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(BIIIIIILclient!lq;)V")
	public Class351(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class28_Sub1 arg7) {
		this.anInt9877 = arg2;
		this.anInt9878 = arg3;
		this.anInt9882 = arg4;
		this.anInt9880 = arg6;
		this.aByte134 = arg0;
		this.anInt9881 = arg1;
		this.anInt9876 = arg5;
		this.aClass28_Sub1_20 = arg7;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)Z")
	public boolean method8229() {
		return this.aByte134 == 2 || this.aByte134 == 3;
	}
}
