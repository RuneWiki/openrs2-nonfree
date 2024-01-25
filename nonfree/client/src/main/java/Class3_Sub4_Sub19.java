import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rc")
public final class Class3_Sub4_Sub19 extends Class3_Sub4 {

	@OriginalMember(owner = "client!rc", name = "M", descriptor = "I")
	public int anInt9091 = -1;

	@OriginalMember(owner = "client!rc", name = "E", descriptor = "Z")
	public boolean aBoolean670 = true;

	@OriginalMember(owner = "client!rc", name = "D", descriptor = "I")
	public int anInt9088 = 12800;

	@OriginalMember(owner = "client!rc", name = "F", descriptor = "I")
	public int anInt9086 = 12800;

	@OriginalMember(owner = "client!rc", name = "G", descriptor = "I")
	public int anInt9087 = 0;

	@OriginalMember(owner = "client!rc", name = "C", descriptor = "I")
	public int anInt9097 = -1;

	@OriginalMember(owner = "client!rc", name = "v", descriptor = "I")
	public int anInt9095 = 0;

	@OriginalMember(owner = "client!rc", name = "O", descriptor = "I")
	public final int anInt9098;

	@OriginalMember(owner = "client!rc", name = "K", descriptor = "Ljava/lang/String;")
	public final String aString118;

	@OriginalMember(owner = "client!rc", name = "I", descriptor = "I")
	public final int anInt9099;

	@OriginalMember(owner = "client!rc", name = "A", descriptor = "Ljava/lang/String;")
	public final String aString119;

	@OriginalMember(owner = "client!rc", name = "x", descriptor = "Lclient!tj;")
	public final Class357 aClass357_53;

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
	public Class3_Sub4_Sub19(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt9091 = arg6;
		this.anInt9098 = arg0;
		this.aBoolean670 = arg5;
		this.aString118 = arg1;
		this.anInt9097 = arg4;
		this.anInt9099 = arg3;
		this.aString119 = arg2;
		if (this.anInt9091 == 255) {
			this.anInt9091 = 0;
		}
		this.aClass357_53 = new Class357();
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(II[II)Z")
	public boolean method7607(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(11) Class3_Sub26 local11 = (Class3_Sub26) this.aClass357_53.method8391(); local11 != null; local11 = (Class3_Sub26) this.aClass357_53.method8392()) {
			if (local11.method3480(arg0, arg3)) {
				local11.method3482(arg2, arg0, arg3);
				return true;
			}
		}
		if (arg1 < 41) {
			Static542.method7606((Class221) null, 74, false, 24);
		}
		return false;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(I[III)Z")
	public boolean method7609(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		for (@Pc(11) Class3_Sub26 local11 = (Class3_Sub26) this.aClass357_53.method8391(); local11 != null; local11 = (Class3_Sub26) this.aClass357_53.method8392()) {
			if (local11.method3481(arg0, arg2)) {
				local11.method3483(arg1, arg0, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)V")
	public void method7610() {
		this.anInt9088 = 12800;
		this.anInt9095 = 0;
		this.anInt9087 = 0;
		this.anInt9086 = 12800;
		for (@Pc(31) Class3_Sub26 local31 = (Class3_Sub26) this.aClass357_53.method8391(); local31 != null; local31 = (Class3_Sub26) this.aClass357_53.method8392()) {
			if (local31.anInt4221 > this.anInt9095) {
				this.anInt9095 = local31.anInt4221;
			}
			if (local31.anInt4217 < this.anInt9086) {
				this.anInt9086 = local31.anInt4217;
			}
			if (local31.anInt4224 > this.anInt9087) {
				this.anInt9087 = local31.anInt4224;
			}
			if (this.anInt9088 > local31.anInt4218) {
				this.anInt9088 = local31.anInt4218;
			}
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(III[II)Z")
	public boolean method7611(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		for (@Pc(22) Class3_Sub26 local22 = (Class3_Sub26) this.aClass357_53.method8391(); local22 != null; local22 = (Class3_Sub26) this.aClass357_53.method8392()) {
			if (local22.method3484(arg3, arg1, arg0)) {
				local22.method3482(arg2, arg3, arg1);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(III)Z")
	public boolean method7612(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(17) Class3_Sub26 local17 = (Class3_Sub26) this.aClass357_53.method8391(); local17 != null; local17 = (Class3_Sub26) this.aClass357_53.method8392()) {
			if (local17.method3480(arg0, arg1)) {
				return true;
			}
		}
		return false;
	}
}
