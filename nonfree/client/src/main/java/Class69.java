import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public final class Class69 {

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "I")
	public int anInt2215;

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "Lclient!dg;")
	public Class69 aClass69_1;

	@OriginalMember(owner = "client!dg", name = "d", descriptor = "I")
	public int anInt2216;

	@OriginalMember(owner = "client!dg", name = "e", descriptor = "I")
	public int anInt2217;

	@OriginalMember(owner = "client!dg", name = "f", descriptor = "I")
	public int anInt2218;

	@OriginalMember(owner = "client!dg", name = "g", descriptor = "I")
	public int anInt2219;

	@OriginalMember(owner = "client!dg", name = "l", descriptor = "I")
	public int anInt2224;

	@OriginalMember(owner = "client!dg", name = "p", descriptor = "I")
	public int anInt2228;

	@OriginalMember(owner = "client!dg", name = "r", descriptor = "I")
	public int anInt2229;

	@OriginalMember(owner = "client!dg", name = "v", descriptor = "I")
	public int anInt2233;

	@OriginalMember(owner = "client!dg", name = "n", descriptor = "I")
	public final int anInt2226;

	@OriginalMember(owner = "client!dg", name = "u", descriptor = "I")
	public final int anInt2232;

	@OriginalMember(owner = "client!dg", name = "s", descriptor = "I")
	public final int anInt2230;

	@OriginalMember(owner = "client!dg", name = "o", descriptor = "I")
	private final int anInt2227;

	@OriginalMember(owner = "client!dg", name = "q", descriptor = "B")
	public final byte aByte29;

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(IIIIB)V")
	public Class69(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.anInt2226 = arg1;
		this.anInt2232 = arg2;
		this.anInt2230 = arg3;
		this.anInt2227 = arg0;
		this.aByte29 = arg4;
	}

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(Lclient!dg;I)V")
	public Class69(@OriginalArg(0) Class69 arg0, @OriginalArg(1) int arg1) {
		this.aClass69_1 = arg0;
		this.anInt2227 = this.aClass69_1.anInt2227;
		this.anInt2230 = arg1 + this.aClass69_1.anInt2230;
		this.anInt2226 = this.aClass69_1.anInt2226 + arg1;
		this.aByte29 = this.aClass69_1.aByte29;
		this.anInt2232 = this.aClass69_1.anInt2232 + arg1;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIII)Lclient!dg;")
	public Class69 method2010(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return new Class69(this.anInt2227, arg1, arg2, arg0, this.aByte29);
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(I)Lclient!sf;")
	public Class284 method2012() {
		return Static364.method6163(this.anInt2227);
	}
}
