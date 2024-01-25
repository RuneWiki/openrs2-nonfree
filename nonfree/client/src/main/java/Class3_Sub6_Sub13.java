import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jf")
public final class Class3_Sub6_Sub13 extends Class3_Sub6 {

	@OriginalMember(owner = "client!jf", name = "B", descriptor = "I")
	public int anInt5166 = -1;

	@OriginalMember(owner = "client!jf", name = "x", descriptor = "I")
	public int anInt5162 = 12800;

	@OriginalMember(owner = "client!jf", name = "J", descriptor = "Z")
	public boolean aBoolean405 = true;

	@OriginalMember(owner = "client!jf", name = "H", descriptor = "I")
	public int anInt5169 = 0;

	@OriginalMember(owner = "client!jf", name = "K", descriptor = "I")
	public int anInt5171 = -1;

	@OriginalMember(owner = "client!jf", name = "Q", descriptor = "I")
	public int anInt5176 = 12800;

	@OriginalMember(owner = "client!jf", name = "M", descriptor = "I")
	public int anInt5172 = 0;

	@OriginalMember(owner = "client!jf", name = "C", descriptor = "I")
	public final int anInt5167;

	@OriginalMember(owner = "client!jf", name = "F", descriptor = "Ljava/lang/String;")
	public final String aString65;

	@OriginalMember(owner = "client!jf", name = "w", descriptor = "I")
	public final int anInt5161;

	@OriginalMember(owner = "client!jf", name = "L", descriptor = "Ljava/lang/String;")
	public final String aString66;

	@OriginalMember(owner = "client!jf", name = "G", descriptor = "Lclient!jia;")
	public final Class193 aClass193_28;

	@OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
	public Class3_Sub6_Sub13(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt5171 = arg4;
		this.anInt5167 = arg3;
		this.anInt5166 = arg6;
		this.aString65 = arg2;
		this.anInt5161 = arg0;
		this.aBoolean405 = arg5;
		this.aString66 = arg1;
		if (this.anInt5166 == 255) {
			this.anInt5166 = 0;
		}
		this.aClass193_28 = new Class193();
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V")
	public void method4384() {
		this.anInt5176 = 12800;
		this.anInt5169 = 0;
		this.anInt5162 = 12800;
		this.anInt5172 = 0;
		for (@Pc(27) Class3_Sub46 local27 = (Class3_Sub46) this.aClass193_28.method4457(); local27 != null; local27 = (Class3_Sub46) this.aClass193_28.method4459()) {
			if (this.anInt5172 < local27.anInt8686) {
				this.anInt5172 = local27.anInt8686;
			}
			if (local27.anInt8690 > this.anInt5169) {
				this.anInt5169 = local27.anInt8690;
			}
			if (this.anInt5176 > local27.anInt8684) {
				this.anInt5176 = local27.anInt8684;
			}
			if (local27.anInt8676 < this.anInt5162) {
				this.anInt5162 = local27.anInt8676;
			}
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "([IIBI)Z")
	public boolean method4385(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(16) Class3_Sub46 local16 = (Class3_Sub46) this.aClass193_28.method4457(); local16 != null; local16 = (Class3_Sub46) this.aClass193_28.method4459()) {
			if (local16.method7353(arg1, arg2)) {
				local16.method7347(arg1, arg2, arg0);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(II[II)Z")
	public boolean method4387(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		for (@Pc(20) Class3_Sub46 local20 = (Class3_Sub46) this.aClass193_28.method4457(); local20 != null; local20 = (Class3_Sub46) this.aClass193_28.method4459()) {
			if (local20.method7351(arg0, arg2)) {
				local20.method7348(arg0, arg1, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIII[I)Z")
	public boolean method4388(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(19) Class3_Sub46 local19 = (Class3_Sub46) this.aClass193_28.method4457(); local19 != null; local19 = (Class3_Sub46) this.aClass193_28.method4459()) {
			if (local19.method7349(arg1, arg0, arg2)) {
				local19.method7347(arg1, arg0, arg3);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIB)Z")
	public boolean method4390(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(11) Class3_Sub46 local11 = (Class3_Sub46) this.aClass193_28.method4457(); local11 != null; local11 = (Class3_Sub46) this.aClass193_28.method4459()) {
			if (local11.method7353(arg1, arg0)) {
				return true;
			}
		}
		return false;
	}
}
