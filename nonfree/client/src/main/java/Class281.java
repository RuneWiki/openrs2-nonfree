import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qw")
public final class Class281 {

	@OriginalMember(owner = "client!qw", name = "c", descriptor = "Lclient!uca;")
	public Class4_Sub47 aClass4_Sub47_3;

	@OriginalMember(owner = "client!qw", name = "e", descriptor = "Lclient!ep;")
	public Class4_Sub16_Sub1 aClass4_Sub16_Sub1_3;

	@OriginalMember(owner = "client!qw", name = "i", descriptor = "Lclient!pp;")
	public Class4_Sub7_Sub4 aClass4_Sub7_Sub4_3;

	@OriginalMember(owner = "client!qw", name = "q", descriptor = "Lclient!tu;")
	public Class321 aClass321_1;

	@OriginalMember(owner = "client!qw", name = "b", descriptor = "I")
	public final int anInt8201;

	@OriginalMember(owner = "client!qw", name = "k", descriptor = "I")
	public final int anInt8205;

	@OriginalMember(owner = "client!qw", name = "j", descriptor = "B")
	public final byte aByte85;

	@OriginalMember(owner = "client!qw", name = "l", descriptor = "I")
	public final int anInt8206;

	@OriginalMember(owner = "client!qw", name = "d", descriptor = "I")
	public int anInt8202;

	@OriginalMember(owner = "client!qw", name = "p", descriptor = "Lclient!ub;")
	public final Class1_Sub4 aClass1_Sub4_3;

	@OriginalMember(owner = "client!qw", name = "f", descriptor = "I")
	public final int anInt8203;

	@OriginalMember(owner = "client!qw", name = "g", descriptor = "I")
	public final int anInt8204;

	@OriginalMember(owner = "client!qw", name = "<init>", descriptor = "(BIIIIIILclient!ub;)V")
	public Class281(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class1_Sub4 arg7) {
		this.anInt8201 = arg4;
		this.anInt8205 = arg6;
		this.aByte85 = arg0;
		this.anInt8206 = arg5;
		this.anInt8202 = arg3;
		this.aClass1_Sub4_3 = arg7;
		this.anInt8203 = arg1;
		this.anInt8204 = arg2;
	}

	@OriginalMember(owner = "client!qw", name = "b", descriptor = "(I)Z")
	public boolean method6807() {
		return this.aByte85 == 2 || this.aByte85 == 3;
	}
}
