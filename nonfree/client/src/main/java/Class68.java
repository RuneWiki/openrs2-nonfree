import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public final class Class68 implements Interface8 {

	@OriginalMember(owner = "client!dq", name = "k", descriptor = "I")
	public final int anInt2322;

	@OriginalMember(owner = "client!dq", name = "g", descriptor = "Lclient!ffa;")
	public final Class100 aClass100_2;

	@OriginalMember(owner = "client!dq", name = "e", descriptor = "Z")
	public final boolean aBoolean181;

	@OriginalMember(owner = "client!dq", name = "n", descriptor = "I")
	public final int anInt2324;

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "I")
	public final int anInt2314;

	@OriginalMember(owner = "client!dq", name = "f", descriptor = "I")
	public final int anInt2318;

	@OriginalMember(owner = "client!dq", name = "l", descriptor = "Lclient!oca;")
	public final Class237 aClass237_1;

	@OriginalMember(owner = "client!dq", name = "c", descriptor = "I")
	public final int anInt2316;

	@OriginalMember(owner = "client!dq", name = "m", descriptor = "I")
	public final int anInt2323;

	@OriginalMember(owner = "client!dq", name = "b", descriptor = "I")
	public final int anInt2315;

	@OriginalMember(owner = "client!dq", name = "d", descriptor = "I")
	public final int anInt2317;

	@OriginalMember(owner = "client!dq", name = "<init>", descriptor = "(ILclient!ffa;Lclient!oca;IIIIIIIZ)V")
	public Class68(@OriginalArg(0) int arg0, @OriginalArg(1) Class100 arg1, @OriginalArg(2) Class237 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		this.anInt2322 = arg8;
		this.aClass100_2 = arg1;
		this.aBoolean181 = arg10;
		this.anInt2324 = arg3;
		this.anInt2314 = arg9;
		this.anInt2318 = arg4;
		this.aClass237_1 = arg2;
		this.anInt2316 = arg5;
		this.anInt2323 = arg0;
		this.anInt2315 = arg6;
		this.anInt2317 = arg7;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(I)Lclient!fl;")
	@Override
	public Class103 method7774() {
		return Static333.aClass103_4;
	}
}
