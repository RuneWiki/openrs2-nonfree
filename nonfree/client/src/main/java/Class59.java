import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public final class Class59 {

	@OriginalMember(owner = "client!co", name = "c", descriptor = "Lclient!tca;")
	public Class322 aClass322_1;

	@OriginalMember(owner = "client!co", name = "e", descriptor = "Lclient!ct;")
	public Class5_Sub11_Sub1 aClass5_Sub11_Sub1_1;

	@OriginalMember(owner = "client!co", name = "m", descriptor = "Lclient!oo;")
	public Class5_Sub38 aClass5_Sub38_1;

	@OriginalMember(owner = "client!co", name = "p", descriptor = "Lclient!hr;")
	public Class5_Sub16_Sub2 aClass5_Sub16_Sub2_1;

	@OriginalMember(owner = "client!co", name = "h", descriptor = "Lclient!kf;")
	public final Class14_Sub1 aClass14_Sub1_5;

	@OriginalMember(owner = "client!co", name = "l", descriptor = "I")
	public final int anInt1288;

	@OriginalMember(owner = "client!co", name = "j", descriptor = "I")
	public final int anInt1286;

	@OriginalMember(owner = "client!co", name = "k", descriptor = "I")
	public int anInt1287;

	@OriginalMember(owner = "client!co", name = "o", descriptor = "I")
	public final int anInt1290;

	@OriginalMember(owner = "client!co", name = "a", descriptor = "I")
	public final int anInt1281;

	@OriginalMember(owner = "client!co", name = "g", descriptor = "B")
	public final byte aByte19;

	@OriginalMember(owner = "client!co", name = "q", descriptor = "I")
	public final int anInt1291;

	@OriginalMember(owner = "client!co", name = "<init>", descriptor = "(BIIIIIILclient!kf;)V")
	public Class59(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class14_Sub1 arg7) {
		this.aClass14_Sub1_5 = arg7;
		this.anInt1288 = arg6;
		this.anInt1286 = arg2;
		this.anInt1287 = arg3;
		this.anInt1290 = arg1;
		this.anInt1281 = arg4;
		this.aByte19 = arg0;
		this.anInt1291 = arg5;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(I)Z")
	public boolean method1242() {
		return this.aByte19 == 2 || this.aByte19 == 3;
	}
}
