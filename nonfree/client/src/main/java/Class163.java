import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public final class Class163 {

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "I")
	public int anInt5782 = Static251.method4760();

	@OriginalMember(owner = "client!jm", name = "g", descriptor = "Ljava/lang/String;")
	public String aString56;

	@OriginalMember(owner = "client!jm", name = "p", descriptor = "I")
	public int anInt5788;

	@OriginalMember(owner = "client!jm", name = "f", descriptor = "Ljava/lang/String;")
	public String aString55;

	@OriginalMember(owner = "client!jm", name = "k", descriptor = "Ljava/lang/String;")
	public String aString58;

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "I")
	public int anInt5783;

	@OriginalMember(owner = "client!jm", name = "i", descriptor = "Ljava/lang/String;")
	public String aString57;

	@OriginalMember(owner = "client!jm", name = "e", descriptor = "Ljava/lang/String;")
	public String aString54;

	@OriginalMember(owner = "client!jm", name = "d", descriptor = "I")
	public int anInt5785;

	@OriginalMember(owner = "client!jm", name = "j", descriptor = "I")
	public int anInt5787;

	@OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
	public Class163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(6) int arg6, @OriginalArg(7) String arg7) {
		this.aString56 = arg5;
		this.anInt5788 = Static251.anInt5580;
		this.aString55 = arg7;
		this.aString58 = arg3;
		this.anInt5783 = arg1;
		this.aString57 = arg2;
		this.aString54 = arg4;
		this.anInt5785 = arg6;
		this.anInt5787 = arg0;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;ILjava/lang/String;I)V")
	public void method4903(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int arg5, @OriginalArg(7) String arg6, @OriginalArg(8) int arg7) {
		this.anInt5782 = Static251.method4760();
		this.aString55 = arg6;
		this.aString56 = arg0;
		this.anInt5787 = arg7;
		this.aString54 = arg2;
		this.anInt5785 = arg1;
		this.anInt5783 = arg5;
		this.aString57 = arg3;
		this.aString58 = arg4;
		this.anInt5788 = Static251.anInt5580;
	}
}
