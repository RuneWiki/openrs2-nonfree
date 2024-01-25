import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uj")
public final class Class357 implements Interface16 {

	@OriginalMember(owner = "client!uj", name = "g", descriptor = "Lclient!hh;")
	private Class6 aClass6_37;

	@OriginalMember(owner = "client!uj", name = "d", descriptor = "Lclient!efa;")
	private final Class98 aClass98_1;

	@OriginalMember(owner = "client!uj", name = "c", descriptor = "Lclient!uq;")
	private final Class362 aClass362_144;

	@OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(Lclient!uq;Lclient!efa;)V")
	public Class357(@OriginalArg(0) Class362 arg0, @OriginalArg(1) Class98 arg1) {
		this.aClass98_1 = arg1;
		this.aClass362_144 = arg0;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(B)V")
	@Override
	public void method8280() {
		this.aClass6_37 = Static392.method5476(this.aClass362_144, this.aClass98_1.anInt2552);
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8281() {
		return this.aClass362_144.method8365(this.aClass98_1.anInt2552);
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8282() {
		@Pc(16) int local16 = Static531.anInt8327 > Static95.anInt9415 ? Static531.anInt8327 : Static95.anInt9415;
		@Pc(23) int local23 = Static195.anInt3525 < Static13.anInt306 ? Static13.anInt306 : Static195.anInt3525;
		@Pc(27) int local27 = this.aClass6_37.method5130();
		@Pc(31) int local31 = this.aClass6_37.method5134();
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = local16;
		@Pc(41) int local41 = local31 * local16 / local27;
		@Pc(48) int local48 = (local23 - local41) / 2;
		if (local41 > local23) {
			local41 = local23;
			local48 = 0;
			local35 = local27 * local23 / local31;
			local33 = (local16 - local35) / 2;
		}
		this.aClass6_37.method5121(local33, local48, local35, local41);
	}
}
