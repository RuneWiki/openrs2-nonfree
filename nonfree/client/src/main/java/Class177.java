import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public final class Class177 {

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "Lclient!pga;")
	public Class1_Sub38 aClass1_Sub38_1;

	@OriginalMember(owner = "client!jr", name = "g", descriptor = "Lclient!jq;")
	public Class176 aClass176_1;

	@OriginalMember(owner = "client!jr", name = "h", descriptor = "Lclient!ql;")
	public Class1_Sub40_Sub1 aClass1_Sub40_Sub1_1;

	@OriginalMember(owner = "client!jr", name = "n", descriptor = "Lclient!bga;")
	public Class1_Sub8_Sub1 aClass1_Sub8_Sub1_1;

	@OriginalMember(owner = "client!jr", name = "j", descriptor = "I")
	public final int anInt4724;

	@OriginalMember(owner = "client!jr", name = "l", descriptor = "I")
	public int anInt4726;

	@OriginalMember(owner = "client!jr", name = "e", descriptor = "B")
	public final byte aByte67;

	@OriginalMember(owner = "client!jr", name = "o", descriptor = "I")
	public final int anInt4727;

	@OriginalMember(owner = "client!jr", name = "c", descriptor = "I")
	public final int anInt4722;

	@OriginalMember(owner = "client!jr", name = "k", descriptor = "I")
	public final int anInt4725;

	@OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(BIIIII)V")
	public Class177(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt4724 = arg2;
		this.anInt4726 = arg3;
		this.aByte67 = arg0;
		this.anInt4727 = arg4;
		this.anInt4722 = arg5;
		this.anInt4725 = arg1;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(B)Z")
	public boolean method4029() {
		return this.aByte67 == 2 || this.aByte67 == 3;
	}
}
