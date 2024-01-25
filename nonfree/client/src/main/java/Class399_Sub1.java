import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wd")
public final class Class399_Sub1 extends Class399 {

	@OriginalMember(owner = "client!wd", name = "p", descriptor = "I")
	private int anInt11002 = 0;

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(Lclient!ik;Lclient!lh;)V")
	public Class399_Sub1(@OriginalArg(0) Class182 arg0, @OriginalArg(1) Class227_Sub1 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method9317() {
		@Pc(17) int local17 = super.aClass227_2.aClass223_9.method5074(super.aClass178_32.method7627(), Static221.anInt3616) + super.aClass227_2.anInt5833;
		@Pc(31) int local31 = super.aClass227_2.aClass352_9.method7803(Static700.anInt10927, super.aClass178_32.method7632()) + super.aClass227_2.anInt5837;
		super.aClass178_32.method7619((float) (local17 + super.aClass178_32.method7627() / 2), (float) (local31 + super.aClass178_32.method7632() / 2), 4096, this.anInt11002);
		this.anInt11002 += ((Class227_Sub1) super.aClass227_2).anInt5839;
	}
}
