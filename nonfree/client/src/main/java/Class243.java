import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public final class Class243 {

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "Lclient!haa;")
	public Class133 aClass133_1;

	@OriginalMember(owner = "client!nr", name = "d", descriptor = "Lclient!qw;")
	public Class6_Sub46 aClass6_Sub46_3;

	@OriginalMember(owner = "client!nr", name = "j", descriptor = "Lclient!fk;")
	public Class6_Sub21_Sub1 aClass6_Sub21_Sub1_4;

	@OriginalMember(owner = "client!nr", name = "k", descriptor = "Lclient!wu;")
	public Class6_Sub8_Sub5 aClass6_Sub8_Sub5_4;

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "B")
	public final byte aByte108;

	@OriginalMember(owner = "client!nr", name = "g", descriptor = "I")
	public final int anInt6780;

	@OriginalMember(owner = "client!nr", name = "l", descriptor = "I")
	public int anInt6783;

	@OriginalMember(owner = "client!nr", name = "f", descriptor = "Lclient!oq;")
	public final Class2_Sub1 aClass2_Sub1_18;

	@OriginalMember(owner = "client!nr", name = "c", descriptor = "I")
	public final int anInt6778;

	@OriginalMember(owner = "client!nr", name = "e", descriptor = "I")
	public final int anInt6779;

	@OriginalMember(owner = "client!nr", name = "m", descriptor = "I")
	public final int anInt6784;

	@OriginalMember(owner = "client!nr", name = "n", descriptor = "I")
	public final int anInt6785;

	@OriginalMember(owner = "client!nr", name = "<init>", descriptor = "(BIIIIIILclient!oq;)V")
	public Class243(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class2_Sub1 arg7) {
		this.aByte108 = arg0;
		this.anInt6780 = arg1;
		this.anInt6783 = arg3;
		this.aClass2_Sub1_18 = arg7;
		this.anInt6778 = arg4;
		this.anInt6779 = arg2;
		this.anInt6784 = arg6;
		this.anInt6785 = arg5;
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(I)Z")
	public boolean method5814() {
		return this.aByte108 == 2 || this.aByte108 == 3;
	}
}
