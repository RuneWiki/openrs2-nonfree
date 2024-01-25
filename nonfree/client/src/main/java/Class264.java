import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ol")
public final class Class264 {

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "Lclient!ew;")
	public Class39_Sub3 aClass39_Sub3_1 = null;

	@OriginalMember(owner = "client!ol", name = "f", descriptor = "Lclient!ew;")
	public Class39_Sub3 aClass39_Sub3_3 = null;

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "[Lclient!kf;")
	public Class39_Sub4[] aClass39_Sub4Array3 = null;

	@OriginalMember(owner = "client!ol", name = "g", descriptor = "[Lclient!kf;")
	public Class39_Sub4[] aClass39_Sub4Array4 = null;

	@OriginalMember(owner = "client!ol", name = "e", descriptor = "Lclient!ew;")
	public Class39_Sub3 aClass39_Sub3_2 = null;

	@OriginalMember(owner = "client!ol", name = "i", descriptor = "Z")
	public final boolean aBoolean579;

	@OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(Lclient!hk;)V")
	public Class264(@OriginalArg(0) Class16_Sub2 arg0) {
		this.aBoolean579 = arg0.aBoolean320;
		Static328.method5086(arg0);
		if (this.aBoolean579) {
			@Pc(33) byte[] local33 = Static128.method2246(Static667.anObject20, false);
			this.aClass39_Sub3_2 = new Class39_Sub3(arg0, 6410, 128, 128, 16, local33, 6410);
			@Pc(50) byte[] local50 = Static128.method2246(Static487.anObject15, false);
			this.aClass39_Sub3_3 = new Class39_Sub3(arg0, 6410, 128, 128, 16, local50, 6410);
			@Pc(65) Class390 local65 = arg0.aClass390_1;
			if (local65.method8679()) {
				local33 = Static128.method2246(Static126.anObject5, false);
				this.aClass39_Sub3_1 = new Class39_Sub3(arg0, 6408, 128, 128, 16);
				@Pc(95) Class39_Sub3 local95 = new Class39_Sub3(arg0, 6409, 128, 128, 16, local33, 6409);
				if (local65.method8681(this.aClass39_Sub3_1, local95, 2.0F)) {
					this.aClass39_Sub3_1.method8458();
				} else {
					this.aClass39_Sub3_1.method8467();
					this.aClass39_Sub3_1 = null;
				}
				local95.method8467();
				return;
			}
		} else {
			this.aClass39_Sub4Array3 = new Class39_Sub4[16];
			for (@Pc(127) int local127 = 0; local127 < 16; local127++) {
				@Pc(141) byte[] local141 = Static213.method3377(Static667.anObject20, local127 * 128 * 128 * 2);
				this.aClass39_Sub4Array3[local127] = new Class39_Sub4(arg0, 3553, 6410, 128, 128, true, local141, 6410, false);
			}
			this.aClass39_Sub4Array4 = new Class39_Sub4[16];
			for (@Pc(169) int local169 = 0; local169 < 16; local169++) {
				@Pc(183) byte[] local183 = Static213.method3377(Static487.anObject15, 2 * 128 * local169 * 128);
				this.aClass39_Sub4Array4[local169] = new Class39_Sub4(arg0, 3553, 6410, 128, 128, true, local183, 6410, false);
			}
		}
	}
}
