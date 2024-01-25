import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ek")
public abstract class Class4_Sub13 extends Class4 {

	@OriginalMember(owner = "client!ek", name = "A", descriptor = "[I")
	public static final int[] anIntArray496 = new int[16384];

	@OriginalMember(owner = "client!ek", name = "B", descriptor = "[I")
	public static final int[] anIntArray497 = new int[16384];

	@OriginalMember(owner = "client!ek", name = "x", descriptor = "Z")
	public boolean aBoolean456;

	@OriginalMember(owner = "client!ek", name = "o", descriptor = "Lclient!bt;")
	protected final Class30_Sub1 aClass30_Sub1_37;

	static {
		@Pc(15) double local15 = 3.834951969714103E-4D;
		for (@Pc(17) int local17 = 0; local17 < 16384; local17++) {
			anIntArray497[local17] = (int) (Math.sin(local15 * (double) local17) * 32768.0D);
			anIntArray496[local17] = (int) (Math.cos((double) local17 * local15) * 32768.0D);
		}
	}

	@OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(Lclient!bt;)V")
	public Class4_Sub13(@OriginalArg(0) Class30_Sub1 arg0) {
		this.aClass30_Sub1_37 = arg0;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(II)V")
	public abstract void method5066(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(III)V")
	public abstract void method5067(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)Z")
	public final boolean method5071() {
		return false;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(ILclient!uk;Lclient!uk;Z)V")
	public abstract void method5073(@OriginalArg(0) int arg0, @OriginalArg(1) Class62_Sub2 arg1, @OriginalArg(2) Class62_Sub2 arg2);

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)I")
	public int method5074() {
		return 0;
	}

	@OriginalMember(owner = "client!ek", name = "c", descriptor = "(I)I")
	public final int method5075() {
		return 1;
	}

	@OriginalMember(owner = "client!ek", name = "e", descriptor = "(I)Z")
	public abstract boolean method5076();

	@OriginalMember(owner = "client!ek", name = "f", descriptor = "(I)Z")
	public abstract boolean method5077();

	@OriginalMember(owner = "client!ek", name = "c", descriptor = "(Z)V")
	public abstract void method5078();

	@OriginalMember(owner = "client!ek", name = "d", descriptor = "(Z)Z")
	public final boolean method5079() {
		return this.aBoolean456;
	}
}
