import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hl")
public final class Class101 {

	@OriginalMember(owner = "client!hl", name = "e", descriptor = "[B")
	public static final byte[] aByteArray42;

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "Lclient!le;")
	private Class3_Sub4 aClass3_Sub4_29 = new Class3_Sub4();

	@OriginalMember(owner = "client!hl", name = "k", descriptor = "Lclient!uj;")
	private final Class244 aClass244_5 = new Class244();

	@OriginalMember(owner = "client!hl", name = "m", descriptor = "I")
	private final int anInt3088;

	@OriginalMember(owner = "client!hl", name = "l", descriptor = "I")
	private int anInt3087;

	@OriginalMember(owner = "client!hl", name = "j", descriptor = "Lclient!an;")
	private final Class11 aClass11_20;

	static {
		@Pc(1) int local1 = 0;
		aByteArray42 = new byte[32896];
		for (@Pc(6) int local6 = 0; local6 < 256; local6++) {
			for (@Pc(9) int local9 = 0; local9 <= local6; local9++) {
				aByteArray42[local1++] = (byte) (255.0D / Math.sqrt((double) ((float) (local6 * local6 + local9 * local9 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(I)V")
	public Class101(@OriginalArg(0) int arg0) {
		this.anInt3088 = arg0;
		this.anInt3087 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; arg0 > local19 + local19; local19 += local19) {
		}
		this.aClass11_20 = new Class11(local19);
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(JBLclient!le;)V")
	public void method2477(@OriginalArg(0) long arg0, @OriginalArg(2) Class3_Sub4 arg1) {
		if (this.anInt3087 == 0) {
			@Pc(7) Class3_Sub4 local7 = this.aClass244_5.method5235();
			local7.method5977();
			local7.method5949();
			if (this.aClass3_Sub4_29 == local7) {
				local7 = this.aClass244_5.method5235();
				local7.method5977();
				local7.method5949();
			}
		} else {
			this.anInt3087--;
		}
		this.aClass11_20.method319(arg1, arg0);
		this.aClass244_5.method5234(arg1);
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IJ)Lclient!le;")
	public Class3_Sub4 method2479(@OriginalArg(1) long arg0) {
		@Pc(18) Class3_Sub4 local18 = (Class3_Sub4) this.aClass11_20.method324(arg0);
		if (local18 != null) {
			this.aClass244_5.method5234(local18);
		}
		return local18;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)V")
	public void method2481() {
		this.aClass244_5.method5238();
		this.aClass11_20.method312();
		this.aClass3_Sub4_29 = new Class3_Sub4();
		this.anInt3087 = this.anInt3088;
	}
}
