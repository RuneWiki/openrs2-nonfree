import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public final class Class239 {

	@OriginalMember(owner = "client!nm", name = "i", descriptor = "Lclient!oba;")
	public Class249 aClass249_1;

	@OriginalMember(owner = "client!nm", name = "l", descriptor = "Lclient!vp;")
	public Class1_Sub49 aClass1_Sub49_3;

	@OriginalMember(owner = "client!nm", name = "t", descriptor = "Lclient!sf;")
	public Class1_Sub6_Sub4 aClass1_Sub6_Sub4_4;

	@OriginalMember(owner = "client!nm", name = "u", descriptor = "Lclient!bu;")
	public Class1_Sub13_Sub1 aClass1_Sub13_Sub1_4;

	@OriginalMember(owner = "client!nm", name = "f", descriptor = "I")
	public final int anInt6458;

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "Lclient!vv;")
	public final Class11_Sub1 aClass11_Sub1_2;

	@OriginalMember(owner = "client!nm", name = "m", descriptor = "I")
	public final int anInt6462;

	@OriginalMember(owner = "client!nm", name = "s", descriptor = "I")
	public final int anInt6466;

	@OriginalMember(owner = "client!nm", name = "n", descriptor = "I")
	public final int anInt6463;

	@OriginalMember(owner = "client!nm", name = "q", descriptor = "B")
	public final byte aByte87;

	@OriginalMember(owner = "client!nm", name = "d", descriptor = "I")
	public final int anInt6456;

	@OriginalMember(owner = "client!nm", name = "h", descriptor = "I")
	public int anInt6459;

	@OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(BIIIIIILclient!vv;)V")
	public Class239(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class11_Sub1 arg7) {
		this.anInt6458 = arg1;
		this.aClass11_Sub1_2 = arg7;
		this.anInt6462 = arg5;
		this.anInt6466 = arg6;
		this.anInt6463 = arg2;
		this.aByte87 = arg0;
		this.anInt6456 = arg4;
		this.anInt6459 = arg3;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(B)Z")
	public boolean method5242() {
		return this.aByte87 == 2 || this.aByte87 == 3;
	}
}
