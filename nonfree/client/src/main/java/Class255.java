import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!op")
public final class Class255 implements Interface27 {

	@OriginalMember(owner = "client!op", name = "g", descriptor = "Lclient!fd;")
	private Class103 aClass103_36;

	@OriginalMember(owner = "client!op", name = "d", descriptor = "Lclient!uu;")
	private final Class343 aClass343_197;

	@OriginalMember(owner = "client!op", name = "j", descriptor = "Lclient!oda;")
	private final Class244 aClass244_1;

	@OriginalMember(owner = "client!op", name = "<init>", descriptor = "(Lclient!uu;Lclient!oda;)V")
	public Class255(@OriginalArg(0) Class343 arg0, @OriginalArg(1) Class244 arg1) {
		this.aClass343_197 = arg0;
		this.aClass244_1 = arg1;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8108() {
		@Pc(16) int local16 = Static330.anInt6254 > Static623.anInt9971 ? Static330.anInt6254 : Static623.anInt9971;
		@Pc(27) int local27 = Static190.anInt3576 > Static269.anInt5258 ? Static190.anInt3576 : Static269.anInt5258;
		@Pc(31) int local31 = this.aClass103_36.method7454();
		@Pc(35) int local35 = this.aClass103_36.method7451();
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = local16;
		@Pc(45) int local45 = local16 * local35 / local31;
		@Pc(52) int local52 = (local27 - local45) / 2;
		if (local45 > local27) {
			local45 = local27;
			local52 = 0;
			local39 = local27 * local31 / local35;
			local37 = (local16 - local39) / 2;
		}
		this.aClass103_36.method7449(local37, local52, local39, local45);
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8109() {
		return this.aClass343_197.method8138(this.aClass244_1.anInt7116);
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(I)V")
	@Override
	public void method8107() {
		this.aClass103_36 = Static209.method3272(this.aClass343_197, this.aClass244_1.anInt7116);
	}
}
