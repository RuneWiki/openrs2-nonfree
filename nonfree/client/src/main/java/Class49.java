import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fd")
public final class Class49 {

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "I")
	public int anInt1367;

	@OriginalMember(owner = "client!fd", name = "h", descriptor = "I")
	public int anInt1370;

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "I")
	public int anInt1368;

	@OriginalMember(owner = "client!fd", name = "e", descriptor = "Lclient!qk;")
	public Class148 aClass148_1;

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(IIII)V")
	public Class49(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) Class148 local5 = Static127.method2017(arg0);
		this.anInt1367 = arg2;
		this.anInt1370 = arg3;
		this.anInt1368 = arg1;
		if (Static291.aBoolean404 || local5.anInt4473 == -1) {
			this.aClass148_1 = local5;
		} else {
			this.aClass148_1 = Static127.method2017(local5.anInt4473);
		}
	}

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(Lclient!qk;III)V")
	public Class49(@OriginalArg(0) Class148 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass148_1 = arg0;
		this.anInt1368 = arg1;
		this.anInt1367 = arg2;
		this.anInt1370 = arg3;
	}
}
